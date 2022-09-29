interface referenceInterface{
    public void apply(int num1, int num2);
}

public class SecondTopic {
    public static class operation{

        /*** Made a Static method here ***/
        static void multiply(int a, int b){
            System.out.println("Multiplication of given numbers is : " + (a*b));
        }

        /*** Made Instance methods here ***/
        public void addition(int a, int b){
            System.out.println("Addition of given numbers is : " + (a+b));
        }

        public void subtraction(int a, int b){
            System.out.println("Subtraction of given numbers is : " + (a-b));
        }
    }
    public static void main(String[] args) {
        /** Calling Static method multiply ***/
        referenceInterface function = operation::multiply;
        function.apply(4,5);

        /*** Calling instance methods addition and subtraction ***/
        function = new operation()::addition;
        function.apply(3,9);

        function = new operation()::subtraction;
        function.apply(9,1);
    }
}
