package com.SpringAssessment1.topic3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*** Here I have used @Component for BinarySearch class **/
@Component
public class BinarySearch {
    /*** And @AutoWired is used for sortAlgorithm **/
    @Autowired
    private sortAlgorithm sortingAlgorithm;

    /*** Question 6 : Here I have used Constructor Injection in the BinarySearch bean ***/
    public BinarySearch(sortAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public int binarySearch(int[] numArray, int numSearch){
        numArray = sortingAlgorithm.sort(numArray);

        System.out.println(sortingAlgorithm);

        int first = 0, last = numArray.length-1;
        int mid = (first + last)/2;

        while( first <= last ){
            if ( numArray[mid] < numSearch )
                first = mid + 1;
            else if ( numArray[mid] == numSearch )
                return mid;
            else
                last = mid - 1;

            mid = (first + last)/2;
        }

        return -1;
    }
}
