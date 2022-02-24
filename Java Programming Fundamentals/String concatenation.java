/*The authority of XYZ gated residential colony wants its residents' name datum Should be stored in the following format - residents' name <space> his/her father's name. 
Write a program to concat the father's name to the residents' name. The name should be validated,on validation the name should contain
only alphabets and space is allowed. If the name is not valid display the message "Invalid name". If valid string then convert  it to uppercase and print it.. */

import java.util.*;
 class Authority
 {
     public static void main (String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Inmate's name:");
         String name=sc.nextLine();
         System.out.println("Inmate's father's name:");
         String fname=sc.nextLine();
         name=name.concat(" ").concat(fname);
         char []chars=name.toCharArray();
         for(char c:chars)
         {
         if(Character.isDigit(c)||c=='+'||c=='!'||c=='@'||c=='#'||c=='%'||c=='$'||c=='^'||c=='&'||c=='*')
         {
            System.out.println("Invalid name");
            System.exit(0);
         }
         }
         System.out.println(name.toUpperCase());
     }
     
    }
