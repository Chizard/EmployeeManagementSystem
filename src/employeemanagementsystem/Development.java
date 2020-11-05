/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem;

public class Development extends Employee  implements NewInterface{             // Subklass av Employee och NewInterface
 
    public Development(String firstName, String lastName, String department, String position, String gender, int dateOfBirth, int salary) {
        super(firstName, lastName, department, position, gender, dateOfBirth, salary);
    }
    
    public Development() {
        
    }
    
    @Override
    public void bonus() {
       double bonus;
       double newSalary;
       int salary;
       bonus = getSalary()*5/100;
       newSalary = getSalary() + bonus;                         // Uppdaterar salary i Employee superklass med getSalary() och lägger sedan till bonus
       salary = (int) newSalary;
       setSalary(salary);                                       // Sätter ny salary från uträkningarna i denna metod
    }
    
    @Override
    public void crunchBonus() {
        double bonus;
       double newSalary;
       int salary;
       bonus = getSalary()*5/100;
       newSalary = getSalary() + bonus;                          // En extra bonus för dem som jobbar i Development
       salary = (int) newSalary;
       setSalary(salary); 
    }
}
