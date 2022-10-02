/***
 * Question : Use rangeClosed to create a  Stream
 * Explanation : Here rangeClosed is used to create an intstream. In rangeClosed startValue and endValue both are inclusive
 * in the stream that is created
 */

import java.util.stream.IntStream;
public class ThirdTopic {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,10).forEach(System.out::println);
    }
}

/***
 * Output:
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 */


