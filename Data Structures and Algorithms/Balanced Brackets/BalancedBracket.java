import java.io.*;import java.util.*;
public class BalancedBracket{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
       
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            String s=sc.next();
            Stack<Character> stk = new Stack<Character>();
            boolean match=true;
            
            for(int index=0;index<s.length();index++){
            char ch=s.charAt(index);
            
            if(ch=='(' || ch=='{' || ch=='['){         
                stk.push(ch);
            }
            else if(stk.isEmpty()){
                match=false;break;
            }
            else if(ch==')'){
                if( '(' != (char)stk.pop()){
                    match=false;break;
                }
            }
            else if(ch==']'){
                if( '[' != (char)stk.pop()){
                    match=false;break;
                }
                
            }
            else if(ch=='}'){
                if( '{' != (char)stk.pop()){
                    match=false;break;
                }
                
            }         
        }
        if(match){
            //if(s==null || s.length()%2 !=0){System.out.println("NO");}
            if(!stk.isEmpty()){System.out.println("NO");}
            else{System.out.println("YES");}
                
        }
        else{
            System.out.println("NO");
        }
        
        }
    }
}
