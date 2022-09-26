public class FirstTopic {
    //Declaring and Initializing the Static Variables here
    static String firstName="Mohit",lastName="Ramtari";
    static int age=21;

    //Using Static Block here
    static{
        System.out.println("First Name :"+firstName + "\n" + "Last Name : " + lastName + "\n" + "Age : "+ age + "\n");
    }

    //Made the Static Method here
    static void print(){
        System.out.println("First Name :"+firstName + "\n" + "Last Name : " + lastName + "\n" + "Age : "+ age + "\n");
    }

    public static void main(String[] args){
        //Calling the Static Method "Print" from here
        print();

        //Printing data using the variables
        System.out.println("First Name :"+firstName + "\n" + "Last Name : " + lastName + "\n" + "Age : "+ age + "\n");
    }
}
