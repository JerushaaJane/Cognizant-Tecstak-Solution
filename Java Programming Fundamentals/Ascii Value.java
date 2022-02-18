/*Rohan wants a magic board, which displays a character for a corresponding number for his science exhibition. Help him to develop such application. 

For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be displayed.

[Assume the number of inputs should be always 4 ]
*/

import java.util.*;
import java.io.*;
public class AsciValue{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digits:");
        for(int i=1;i<=4;i++){
            int input=sc.nextInt();
            System.out.println(input+"-"+(char)input);
        }
    }
}
