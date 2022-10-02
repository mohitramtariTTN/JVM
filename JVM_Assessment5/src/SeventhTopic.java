/*** Question : Use Of method to create List, Set and Map ***/

import java.util.List;
import java.util.Map;
import java.util.Set;

public class SeventhTopic {
    public static void main(String[] args) {
        System.out.println("List created using of method : " + List.of(1,2,3,4,5,3));
        System.out.println("Map Created using of method : " + Map.of(6,7,8,9,10,11));
        System.out.println("Set created using of method : " + Set.of(1,2,3,4,5));
    }
}

/***
 * Output :
 * List created using of method : [1, 2, 3, 4, 5, 3]
 * Map Created using of method : {8=9, 10=11, 6=7}
 * Set created using of method : [1, 2, 3, 4, 5]
 */