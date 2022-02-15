import java.io.*;
import java.util.*;
public class Placement{
     public static void main (String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");int cse=sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");int ece=sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");int mech=sc.nextInt();
        
        if(cse<0||ece<0||mech<0){
            System.out.println("Input is Invalid");
        }
        else if(cse==ece &&ece==mech){
            System.out.println("None of the department has got the highest placement");
        }
        else if(cse>ece && cse>mech){
            System.out.println("Highest placement \n"+"CSE");
        }
        else if(ece>cse && ece>mech){
            System.out.println("Highest placement \n"+"ECE");
        }
        else if(mech>cse && mech>ece){
            System.out.println("Highest placement \n"+"MECH");
        }
        else if(cse==ece && cse>mech){
            System.out.println("Highest placement \n"+"CSE"+"\n"+"ECE");
        }
        else if(ece==mech && ece>cse){
            System.out.println("Highest placement \n"+"ECE"+"\n"+"MECH");
        }
        else if(mech==cse && mech>ece){
            System.out.println("Highest placement \n"+"MECH"+"\n"+"CSE");
        }
    }
}
