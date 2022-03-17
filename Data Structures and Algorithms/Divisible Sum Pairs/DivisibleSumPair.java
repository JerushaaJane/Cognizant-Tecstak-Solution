import java.io.*; import java.util.*;
public class DivisibleSumPair{
    public static void main(String[]args){
        int count=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i < n-1; i++){
          for(int j=i+1; j< n; j++){
           if( (a[i]+a[j])%k==0)
               count++;
               
        } 
        }
        System.out.println(count);
    }
}    
