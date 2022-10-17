package com.SpringAssessment1.topic3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*** Used the @Component annotation here for Question no. 3 ***/
@Component

/***
 * Question no.5 :-
 *
 * So, to sort the arrays, two algo classes were created namely quickSortAlgo and bubbleSortAlgo,
 * so an error will arise over which component to use.
 * To resolve this issue, @Primary is used with the @Component
 * Whichever component has @Primary annotation, that @Component will be called
 */
@Primary
public class quickSortAlgo implements sortAlgorithm {
    public int[] sort(int[] numArray){
        int begin=0,end=numArray.length-1;
        int pivot = numArray[end];
        int i = begin-1;


        for (int j = begin; j < end; j++) {
            if (numArray[j] <= pivot) {
                i++;

                int swapTemp = numArray[i];
                numArray[i] = numArray[j];
                numArray[j] = swapTemp;
            }
        }

        int swapTemp = numArray[i+1];
        numArray[i+1] = numArray[end];
        numArray[end] = swapTemp;

        return numArray;
    }
}
