import java.io.*;
import java.util.*;
public class sparseArray{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        String[] strings=new String[n];
        for(int i=0; i<n; i++){           //get string array input
            strings[i]=sc.next();
        }
        
        int q=sc.nextInt();
        String[] queries=new String[q];
        for(int j=0; j<q; j++){           //get queries array input
            queries[j]=sc.next();
        }
        
        int[] result=new int[q]; //array to store op
        
        matchingStrings(strings,queries);
    }//main
    
    public static void matchingStrings(String[]s,String[]q){
        int count=0;
        for(int i=0;i<q.length;i++){
            System.out.println(searchCount(s,q[i]));
        }
        
        
    }
    public static int searchCount(String[]s,String a){
        int count=0;
        for(int j=0;j<s.length;j++){
            if(a.equals(s[j])){
                count++;
            }
        }
        return count;
    }
          
        
        /*for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }*/
    
}
