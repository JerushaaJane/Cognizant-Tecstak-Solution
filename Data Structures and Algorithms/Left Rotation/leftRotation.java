import java.util.*;
import java.io.*;
public class leftRotation{
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        
        int[] firstLineInputs=new int[2];       //To get space separated inputs
        for(int i=0; i<firstLineInputs.length; i++){
            firstLineInputs[i]=sc.nextInt();
        }
        int n=firstLineInputs[0];       //no of elements in array
        int d=firstLineInputs[1];       //no of array rotations
        
        int[]arr=new int[n];        //To get array input
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //PERFORM ROTATION
        for(int i=0;i<arr.length;i++){
            int r=(i+d)%arr.length;          
            System.out.print(arr[r]+" ");//
        }  
    }
}
