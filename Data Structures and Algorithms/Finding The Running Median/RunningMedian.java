import java.io.*;import java.util.*;
import java.util.Collections;
import java.util.PriorityQueue;
public class RunningMedian{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(10,Collections.reverseOrder());
            
            for (int i = 0; i < n; ++i) {
                int v = sc.nextInt();
                if (maxHeap.isEmpty() || (v < maxHeap.peek())) {
                    maxHeap.offer(v);
                } else {
                    minHeap.offer(v);
                }
                
                if (maxHeap.size() > (minHeap.size() + 1)) {
                    minHeap.offer(maxHeap.poll());
                }
                
                if (minHeap.size() > (maxHeap.size() + 1)) {
                    maxHeap.offer(minHeap.poll());
                }
                if (maxHeap.size() > minHeap.size()) {
                    System.out.println(maxHeap.peek());
                } else if (minHeap.size() > maxHeap.size()) {
                    System.out.println(minHeap.peek());
                } else {
                    System.out.println(0.5 * (minHeap.peek() + maxHeap.peek()));
                }
            }
         
    }
    
}
