/***
Question : Use iterator stream method to generate a stream
Explanation : iterator works like a for loop. We have to provide an initial value and then a condition
to break the loop, and then the function to increase the value of initial value, just like a for loop
***/
import java.util.stream.IntStream;

public class FourthTopic {
    public static void main(String[] args) {
        IntStream integer = IntStream.iterate(1, i->i<=20, i->i*2);
        integer.forEach(System.out::println);
    }
}

/**
 * Output :
 * 1
 * 2
 * 4
 * 8
 * 16
 */