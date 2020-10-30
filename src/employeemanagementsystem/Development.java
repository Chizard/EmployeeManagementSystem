package employeemanagementsystem;
 
public class Development extends Employee{
 
    public Development(String firstName, String lastName, String department, String position, String gender, int dateOfBirth, int salary) {
        super(firstName, lastName, department, position, gender, dateOfBirth, salary);
        System.out.println("Develoment");
    }
   
    public Development() {
       
    }
   
    @Override
    public void bonus() {
       double bonus;
       double newSalary;
       int salary;
       bonus = getSalary()*5/100;
       newSalary = getSalary() + bonus;
       salary = (int) newSalary;
       setSalary(salary);
    }
   //Testing12
}
