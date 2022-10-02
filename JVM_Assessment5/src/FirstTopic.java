/*** Question : Demonstrate the use of private methods in interfaces ***/

/*** Explanation : Private methods in interface are used to provide reusability of code. And private methods help
 * to hide implementation from the sub-classes which help to achieve encapsulation.
 */

interface calculation{
    default void calculate(int a, int b){
        System.out.println("Addition of given numbers is : "+add(a,b));
        System.out.println("Subtraction of given numbers is : "+sub(a,b));
    }
    private int add(int a,int b){
        return a+b;
    }

    private int sub(int a, int b){
        return a-b;
    }
}
public class FirstTopic implements calculation{
    public static void main(String[] args) {
        calculation obj = new FirstTopic();
        obj.calculate(5,3);
    }
}

/***
 * Output :
 * Addition of given numbers is : 8
 * Subtraction of given numbers is : 2
 */
