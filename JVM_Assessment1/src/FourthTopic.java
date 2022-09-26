import java.io.PrintStream;

public class FourthTopic {
    public static void main(String[] args){
        int[][] TwoDim = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        //Printing the Sum of rows here
        for(int i=0;i< TwoDim.length;i++){
            int sum = 0;
            for(int j=0;j<TwoDim[i].length;j++) sum += TwoDim[i][j];
            System.out.printf("Sum of no.%d row is %d"+"\n", i+1, sum);
        }

        //Printing the Sum of columns here
        for(int i=0;i< TwoDim[0].length;i++){
            int sum = 0;
            for(int j=0;j<TwoDim.length;j++) sum += TwoDim[j][i];
            System.out.printf("Sum of no.%d column is %d"+"\n", i+1, sum);
        }
    }
}
