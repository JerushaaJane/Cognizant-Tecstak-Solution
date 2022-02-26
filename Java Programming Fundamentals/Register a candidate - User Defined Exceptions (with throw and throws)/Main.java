import java.util.*;
public class Main{
    
    public static Candidate getCandidateDetails() throws InvalidSalaryException{
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter the candidate Details");
            
            System.out.println("Name");
            String name=sc.nextLine();
            
            System.out.println("Gender");
            String gender=sc.nextLine();
            
            System.out.println("Expected Salary");
            double salary=sc.nextDouble();
            
            if(salary<10000){
                throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
            }
            else{
                Candidate candi = new Candidate();
                candi.setName(name);
                candi.setGender(gender);
                candi.setExpectedSalary(salary);
                return candi;
            }
  
    }
    public static void main (String[] args) {
        try{
           getCandidateDetails();
           System.out.println("Registration Successful");
           
           
        }
        catch(InvalidSalaryException e){
            System.out.println(e.getMessage());
        }
    }
}