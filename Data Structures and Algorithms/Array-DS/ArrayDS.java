import java.util.*;
import java.io.*;
public class ArrayDS{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]A=new int[N];
        for(int i=0;i<A.length;i++){
             A[i]=sc.nextInt();
        }
        reverseArray(A);
        
    }
    public static void reverseArray(int[]a){
        for(int i=a.length-1; i>=0; i--){
            System.out.print(a[i]+" ");
        }
    }
}
