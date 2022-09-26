import java.util.*;
import java.io.*;
public class SecondTopic {
    public static void main(String[] args){
        StringBuffer str = new StringBuffer("");
        Scanner sc = new Scanner(System.in);
        while(true){
            String input = sc.nextLine();
            if(input.equals("XDONE")){
                System.out.println("Input by the User is : " + str);
                break;
            }else{
                str.append(input+" ");
            }
        }
    }
}
