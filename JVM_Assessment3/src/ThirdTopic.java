import java.util.Stack;
public class ThirdTopic {
    static class SpecialStack{
        Stack<Integer>actualStack;  //To store original elements
        Stack<Integer>minStack;    //To store minimum eleents track

        /*** Constructor is made here ***/
        SpecialStack(){
            actualStack = new Stack<Integer>();
            minStack = new Stack<Integer>();
        }

        /*** Function to get minilmum value in the Stack ***/
        void getMinValue(){
            if(actualStack.isEmpty())
                System.out.println("Special Stack is empty");
            else
                System.out.println("Minimum Element in Stack is : "+minStack.peek());
        }

        /*** Function to check if stack is empty or not ***/
        void isEmpty(){
            if(actualStack.isEmpty())
                System.out.println("Special Stack is empty");
            else
                System.out.println("Special Stack is not empty");
        }

        /*** Function to push elements into actualStack and minStack ***/
        void push(Integer element){
            if(actualStack.isEmpty()){
                actualStack.push(element);
                minStack.push(element);
            }

            /*** If new element is greater than minimum element then just make a copy of min element and push it  **/
            /*** else push the element in the minimum stack ***/
            /*** And in the end push the element in the actualStack ***/
            if(minStack.peek()<element){
                minStack.push(minStack.peek());
            }else{
                minStack.push(element);
            }
            actualStack.push(element);
        }

        /*** Pop method to remove element from actualStack and minStack ***/
        void pop(){
            if(actualStack.isEmpty())
                System.out.println("Stack is empty");
            else{
                minStack.pop();
                Integer element = actualStack.pop();
                System.out.println("Element popped successfully : " + element);
            }
        }
    }

    /*** Driver Program ***/
    public static void main(String[] args){
        SpecialStack s = new SpecialStack();
        s.push(5);
        s.push(3);
        s.push(4);
        s.push(2);
        s.getMinValue();
        s.pop();
        s.getMinValue();
        s.pop();
        s.getMinValue();
    }
}