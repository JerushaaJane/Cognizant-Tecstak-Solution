import java.util.*;
public class ArrayException{
    
    Scanner sc=new Scanner(System.in);
    
    public String getPriceDetails(){
        
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        
        System.out.println("Enter the price details");
        try{
           for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
           } 
        }
        catch(InputMismatchException e){
            return "Input was not in the correct format";
            
        }
        
        
        System.out.println("Enter the index of the array element you want to access");
        try{
           int array_index=sc.nextInt();
           return "The array element is "+arr[array_index];
        }
        catch(InputMismatchException e){
            return "Input was not in the correct format";
        }
        catch(ArrayIndexOutOfBoundsException e){
            return "Array index is out of range";
        }
        
        
        
        
    }
    
    public static void main (String[] args) {
        ArrayException obj=new ArrayException();
        System.out.println(obj.getPriceDetails());
    }
}