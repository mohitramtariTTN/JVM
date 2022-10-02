/**
 * Question : Create Unmodifiable List from a Steam
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NinthTopic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(4);

        /*** Here, i have converted the list into unmodifiable list. Now if it try to change it, it will
         * result into an UnsupportedOperationException.
         */
        List<Integer> unmodifiableList = list.stream().collect(Collectors.toUnmodifiableList());

        /**It will result into an exception ***/
//        unmodifiableList.add(5);
    }
}
