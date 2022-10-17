package com.SpringAssessment1.topic2;

public class BinarySearch {
    /*** To solve the problem of Tightly Coupling, I have created an interface named sortAlgorithm
     * which is implemented by quickSortAlgo and bubbleSortAlgo**/
    private sortAlgorithm sortingAlgorithm;

    /** A constructor which will take the input of which sorting Algorithm to use ***/
    public BinarySearch(sortAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public int binarySearch(int[] numArray, int numSearch){
        /*** Now instead of calling sort method by either quickSortAlgo or bubbleSortAlgo, I am calling it
         * using instance of sortAlgorithm interface which helps to achieve loose coupling.
         */
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
