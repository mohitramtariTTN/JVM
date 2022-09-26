import java.io.*;
import java.util.*;
public class ThirdTopic {
    //Static Methods to find area and circumference of circle
    public static void areaOfCircle(float rad){
        float Area= (float) (3.14*rad*rad);
        System.out.printf("Area of the circle for given radius is %.2f"+"\n",Area);
    }
    public static void circumferenceOfCircle(float rad){
        float Circumference = (float) (2*3.14*rad);
        System.out.printf("Circumference of the circle for given radius is %.2f"+"\n",Circumference);
    }
    public static void main(String[] args){
        System.out.println("*******Menu*******" + "\n" + "1. Calculate Area of Circle" + "\n" + "2. Calculate Circumference of a Circle" + "\n" + "3. Exit.");

        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        do {
            System.out.println("Choose one option from the above menu");
            int opt = sc.nextInt();
            float rad;
            switch (opt){
                case 1:
                    System.out.println("Enter Radius : ");
                    rad = sc.nextFloat();
                    areaOfCircle(rad);
                    break;
                case 2:
                    System.out.println("Enter Radius : ");
                    rad = sc.nextFloat();
                    circumferenceOfCircle(rad);
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Please choose a valid option");
            }
        }while (flag);
    }
}
