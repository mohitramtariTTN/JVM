package com.SpringAssessment1.topic3;
import org.springframework.stereotype.Component;

/*** Used the @Component annotation here for Question no. 3 ***/
@Component
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
