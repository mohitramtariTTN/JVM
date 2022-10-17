package com.SpringAssessment1.topic2;

/*** Just Normal logic of quickSortAlgo ***/
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
