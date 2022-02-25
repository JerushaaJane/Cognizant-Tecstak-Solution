import java.util.Scanner;
public class Main{
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        PermanentEmployee permanentEmployee = new PermanentEmployee(101, "Ritam", 100000);
        TemporaryEmployee temporaryEmployee = new TemporaryEmployee(102, "Chakraborty", 6, 100);
        Loan loan=new Loan();
        
        double permanentEmployeeLoan = loan.calculateLoanAmount(permanentEmployee);
        double temporaryEmployeeLoan = loan.calculateLoanAmount(temporaryEmployee);
        
        System.out.println(permanentEmployeeLoan);
        System.out.println(temporaryEmployeeLoan);
       
    }
    
}