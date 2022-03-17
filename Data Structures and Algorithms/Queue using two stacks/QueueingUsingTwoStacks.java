import java.io.*;import java.util.*;
public class QueueingUsingTwoStacks {
    public static void main(String[] args) {
        
        Queue<Integer> myqueue=new LinkedList<Integer>();
        Scanner sc=new Scanner(System.in);        
        int q=sc.nextInt();   //q=no.of queries
        for(int i=1;i<=q;i++){
            int operation=sc.nextInt();
            if(operation==1){
                myqueue.add(sc.nextInt());
            }
            else if(operation==2){
                myqueue.remove();        //remove head of the queue
                                         //poll()-remove queue head and return it
                                         //peek()=print head of the queue
            }
            else if(operation==3){
               System.out.println(myqueue.peek()) ;
            }   
        } 
        sc.close();  
    }
}
