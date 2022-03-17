import java.io.*; import java.util.*;
public class miniMaxSum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]a=new int[5];          //get array input
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        long min = 0, max = 0;
        for(int i = 0, j = a.length - 1; i < a.length - 1; i++, j--){
            max = max + a[j];
            min = min + a[i];
        }
        System.out.println(min + " " + max);   
       
    }
   
}
