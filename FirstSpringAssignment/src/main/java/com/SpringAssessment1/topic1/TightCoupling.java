/**** Question 1 : Write a program to demonstrate Tightly Coupled code. ***/
/**** Explanation : Tight Coupling is when a group of classes are highly dependent on one another.
 * The situation where an object creates an object of another class is known as tight coupling***/
/** Please checkout BinarySearch file to get example of TightCoupling ***/


package com.SpringAssessment1.topic1;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TightCoupling {
    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int[] numArray = {2,6,1,9,4,22,45};
        int result = search.binarySearch(numArray,22);
        System.out.println(result);
    }

}
