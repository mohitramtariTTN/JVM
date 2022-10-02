/*** Question : Convert an optional type into stream ***/

import java.util.stream.IntStream;
public class SixTopic {
    public static void main(String[] args) {
        IntStream str =
                IntStream.range(11,20)
                .filter(e->e%5==0)
                .findFirst()
                .stream().mapMulti((number,consumer)->{for(int i=1;i<=10;i++){consumer.accept(number*i);}});
        str.forEach(System.out::println);
    }
}

/***
 * Output :
 * 15
 * 30
 * 45
 * 60
 * 75
 * 90
 * 105
 * 120
 * 135
 * 150
 */
