//Question : Perform takeWhile and dropWhile operations on stream

import java.util.stream.IntStream;

public class SecondTopi {
    public static void main(String[] args) {
        //Takewhile means, it will take the values until it matches with the condition inside the bracket.
        //Once that condition is unmatched, it will stop there and drop all the elements from there

        System.out.println("Usage of takeWhile : ");
        IntStream.rangeClosed(1,10).takeWhile(num->num<=5).forEach(System.out::println);

        //DropWhile means, it will drop all the elements until it matches with the condtion and once when
       //the condition is unmatched, it will take all the elements from there

        System.out.println("Usage of dropWhile : ");
        IntStream.rangeClosed(1,10).dropWhile(num->num<=5).forEach(System.out::println);
    }
}

/***
 Output :
 Usage of takeWhile :
 1
 2
 3
 4
 5
 Usage of dropWhile :
 6
 7
 8
 9
 10
 */
