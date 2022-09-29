import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class FirstTopic {
    public static void main(String[] args) {

        /*** First number is greater than second number ***/
        BiPredicate<Integer,Integer> isGreater = (input1,input2)->input1>input2;
        System.out.println(isGreater.test(6,5));

        /*** Adding 1 to the number ***/
        Function<Integer,Integer> addOne = parameter->parameter+1;
        System.out.println(addOne.apply(6));

        /*** Concatenating two strings ***/
        BiFunction<String,String,String> joinStrings = (parameter1,parameter2)->parameter1+parameter2;
        System.out.println(joinStrings.apply("Mohit"," Ramtari"));

        /***Converting the String to UpperCase ***/
        Function<String,String> upperCase = (inputString)->inputString.toUpperCase();
        System.out.println(upperCase.apply("mohit ramtari"));
    }
}
