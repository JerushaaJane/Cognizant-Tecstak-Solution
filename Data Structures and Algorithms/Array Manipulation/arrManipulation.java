import java.io.*;
import java.util.*;
public class arrManipulation{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong(),m=sc.nextLong();
        long max=0,sum=0;
        long arr[]=new long[(int)(n+1)];
        for(long i=0;i<m;i++){
            long a=sc.nextLong(),b=sc.nextLong(),k=sc.nextLong();
            arr[(int)a]+=k;
            if(((int)(b+1))<=n){
                arr[(int)(b+1)]-=k;
            }
        }
        for(long i=1;i<=n;i++){
            sum+=arr[(int) i];
            max=Math.max(max,sum);
        }
        System.out.println(max);
        
    }
}
