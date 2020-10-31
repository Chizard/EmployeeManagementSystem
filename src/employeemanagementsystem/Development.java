/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem;

public class Development extends Employee  implements NewInterface{

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
       newSalary = getSalary() + bonus;
       salary = (int) newSalary;
       setSalary(salary); 
    }
    
    @Override
    public void crunchBonus() {
        double bonus;
       double newSalary;
       int salary;
       bonus = getSalary()*5/100;
       newSalary = getSalary() + bonus;
       salary = (int) newSalary;
       setSalary(salary); 
    }
}
