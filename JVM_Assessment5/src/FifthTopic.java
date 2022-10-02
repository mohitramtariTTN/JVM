import java.util.stream.IntStream;

/***
 * Question : Use ifPresentOrElse, or, orElseThrow Operations with Optional
 * Explanation : ifPresentOrElse is used on optional integer, it checks if optional integer is present then
 * it prints the value or else it prints the exception statement.
 */
public class FifthTopic {
    public static void main(String[] args) {

        /** Here Provided two examples of ifPresentOrElse, one if it fails and other if it success ***/
        IntStream.rangeClosed(1,20).filter(e->e>20).findFirst().ifPresentOrElse(e->System.out.println("Value is "+ e),()-> System.out.println("No value exist"));
        IntStream.rangeClosed(1,20).filter(e->e>15).findFirst().ifPresentOrElse(e->System.out.println("Value is "+ e),()-> System.out.println("No value exist"));

        /** Here provided the example of orElseThrow(), failure message goes in Exception() ***/
        try{
            IntStream.rangeClosed(1,20).filter(e->e>13).findFirst().orElseThrow(()->new Exception("Value not found"));
            IntStream.rangeClosed(1,20).filter(e->e>20).findFirst().orElseThrow(()->new Exception("Value not found"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
