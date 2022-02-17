import java.io.*;import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        double liter=sc.nextInt();
        if(liter<0 || liter==0){
        
           System.out.println((int)liter+" is an Invalid Input");
           System.exit(0);
        }
        
        System.out.println("Enter the distance covered");
        double distance=sc.nextInt();
        if(distance<0 || distance==0){
           System.out.println((int)distance+" is an Invalid Input");
           System.exit(0);
        }
        
        calculate(liter,distance);
    }
    
    public static void calculate(double liter,double dis){
        double liter_per_hun_km=(liter/dis)*100;
        double miles=dis*0.6214;
        double gallon=liter*0.2642;
        double miles_per_gallon=miles/gallon;
        System.out.println("Liters/100KM"+"\n"+ String.format("%.2f",liter_per_hun_km));
        System.out.println("Miles/gallons"+"\n"+String.format("%.2f",miles_per_gallon));
    }
    
}
