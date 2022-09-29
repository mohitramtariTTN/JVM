import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FirstTopic {
    public static void main(String[] args){
        /*** Created a List of Float type ***/
        List<Float> list = new ArrayList<Float>();

        /*** Scanner to take the input of 5 number ***/
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 5 numbers : ");

        /*** Taking Input of float numbers here ****/
        for(int i=1;i<=5;i++){
            Float input = sc.nextFloat();
            list.add(input);
        }

        /*** Making an iterator ***/
        Iterator itr = list.iterator();
        Float sum = (float) 0;
        while(itr.hasNext()){
            Float num = (float)itr.next();
            sum += num;
        }
        System.out.println("Sum of numbers is : " + sum);
    }
}
