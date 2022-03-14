import java.io.*;
import java.util.*;
public class TwoDArray{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        int[][]a=new int[6][6];
        
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println(hourGlassSum(a));
        
    }
    public static int hourGlassSum(int[][]a){
        
        int sum=0;
        int max=Integer.MIN_VALUE;
        //int result=0;
         
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){ 
                
                sum=a[i][j] + a[i][j+1] + a[i][j+2];  //hourglass's top row
                
                sum+=a[i+1][j+1];   //hourglass's middle row
                
                sum+=a[i+2][j] + a[i+2][j+1] + a[i+2][j+2]; //hourglass's last row
                
                max=(sum>max)?sum:max;
                
                
            }
        }
               
        return max;
    } 
}
