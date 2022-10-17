package com.SpringAssessment1.topic1;

public class bubbleSortAlgo {
    public int[] sort(int[] numArray){

        /*** Normal logic of bubbleSort ***/
        int n = numArray.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(numArray[j-1] > numArray[j]){
                    //swap elements
                    temp = numArray[j-1];
                    numArray[j-1] = numArray[j];
                    numArray[j] = temp;
                }
            }
        }
        return numArray;
    }
}
