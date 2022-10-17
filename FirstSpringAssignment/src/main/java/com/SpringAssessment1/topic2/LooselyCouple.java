/**** Question 2 : Write a program to demonstrate Loosely Coupled code. ***/

/**** Explanation : Loose coupling is achieved by means of a design that promotes single-responsibility and separation of concerns.
 * Interfaces are a powerful tool to use for loose coupling or decoupling.
 * Classes can communicate through interfaces rather than other concrete classes.***/

/** Please checkout BinarySearch file to get example of TightCoupling ***/


package com.SpringAssessment1.topic2;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LooselyCouple {
    public static void main(String[] args) {
        /** Here I am passing quickSortAlgo(), so that BinarySearch uses quick sort algorithm to
         * sort the elements
         */
        BinarySearch search = new BinarySearch(new quickSortAlgo());
        System.out.println(search);
        int[] numArray = {2,6,1,9,4,22,45};
        int result = search.binarySearch(numArray,22);
        System.out.println(result);
    }

}
