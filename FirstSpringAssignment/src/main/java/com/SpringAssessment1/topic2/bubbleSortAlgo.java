package com.SpringAssessment1.topic2;

/*** Just Normal logic of bubbleSortAlgo ***/
public class bubbleSortAlgo implements sortAlgorithm {
    public int[] sort(int[] numArray){
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
