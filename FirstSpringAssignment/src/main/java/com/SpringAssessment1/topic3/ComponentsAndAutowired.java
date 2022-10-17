/*** Question 3 : Use @Compenent and @Autowired annotations to in Loosely Coupled code for dependency management ***/

/** Explanation : @Component annotation is used for those classes whose objects are being created and
 * @Autowired annotation is used for the dependencies inside those classes.
 * @Component refers to Bean.
 *
 * In this example, objects of BinarySearch and quickSortAlgo and bubbleSortAlgo are created, so I have
 * given them the annotation @component
 * and sortAlgorithm is a dependency in BinarySearch, so @Autowired is used for that
 */


package com.SpringAssessment1.topic3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ComponentsAndAutowired {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ComponentsAndAutowired.class,args);

        /***
         * Question 4 : Here, I am using getBean method to get the Bean of BinarySearch class
         * from applicationContext
         ***/
        BinarySearch search = applicationContext.getBean(BinarySearch.class);

        int[] numArray = {2,6,1,9,4,22,45};
        int result = search.binarySearch(numArray,22);

        /*** And here I am showing the properties of the BinarySearch bean that we retrieved above ***/
        System.out.println(search);
    }

}
