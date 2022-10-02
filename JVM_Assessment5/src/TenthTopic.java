import java.util.Arrays;

/**
 * Question : Demonstrate the use of repeat, strip, isBlank, indent, transform, stripIndent, translateEscapes, formatted String methods.
 */
public class TenthTopic {

    public static void main(String[] args) {
        /** repeat() method is used to repeat thr string **/
        String str = "Mohit Ramtari \t";
        System.out.println("Result of repeat() method :- ");
        System.out.println(str.repeat(5));

        /** strip() method removes leading and trailing whitespaces ***/
        str = "\n\n\t     Mohit     Ramtari       \t\t";
        System.out.println("Result of strip() method :- ");
        System.out.println(str.strip());

        /** isBlank() returns true if string is empty or only contains whitespace character **/
        System.out.println("Result of isBlank() method :- ");
        str = "     ";
        System.out.println(str.isBlank());

        str = "\n\n\t\t\t";
        System.out.println(str.isBlank());

        /** Indent() method add the indent to the string by the count given in the brackets ***/
        str = "Mohit Ramtari";
        System.out.println("Result of indent() method :- ");
        System.out.println(str.indent(6));

        /** stripIndent() method removes the indent from the string **/
        System.out.println("Result of stripIndent() method :-");
        System.out.println(str.stripIndent()+"\n");

        /*** transform() method allows a function to be applied to a String
         * The function accepts a parameter of type String and returns output of any type
         ***/

        final String string = "To The New";
        str.transform(t->{
            return Arrays.asList(string.split(","));
                });

        /*** translateEscapes() method translates the escape characters into string literals and
         * returns a new string***/
        str = "It is a tab \t, it is a new line \n, it is backspace \b, it is a single quote \'";
        System.out.println("Result of translateEscapes : ");
        System.out.println(str.translateEscapes()+ "\n");

        /*** formatted() method is used to format the string and replace it with arguments***/
        System.out.println("Result of formatted() method :");
        System.out.println("1. %s 2. %s %d. three %d. four".formatted("one","two",3,4));

    }
}
