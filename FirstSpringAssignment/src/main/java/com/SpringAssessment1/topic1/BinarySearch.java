package com.SpringAssessment1.topic1;

public class BinarySearch {
    public int binarySearch(int[] numArray, int numSearch){

        /***
         * Here an object of bubbleSortAlgo is being created, to sort the elements. It is called
         * tight coupling. Now suppose, if I want to use quickSort instead of bubbleSort then I will
         * have to change it everywhere which is a problem created because of tight coupling.
         */

        bubbleSortAlgo bubbleSort = new bubbleSortAlgo();
        numArray = bubbleSort.sort(numArray);

        /*** Normal logic of binary Search ***/
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
