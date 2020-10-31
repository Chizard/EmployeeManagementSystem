/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem;

import java.util.*;

public class Employee {
    private String firstName;
    private String lastName;
    private String department;
    private String position;
    private String gender;
    private int id;
    private int dateOfBirth;
    private int salary;
    private int bonus;
    Scanner scanner = new Scanner(System.in);
    
    static int idGenerator = 1;

    public Employee(String firstName, String lastName, String department, String position, String gender, int dateOfBirth, int salary) {
        this.id = idGenerator; // får samma id... 
        idGenerator++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.position = position;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        //this.bonus = bonus;
    }
    
    public Employee() {
        
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    
    public void bonus() {

    }
     
    public void printOut() {
        System.out.println("Employee - ID: " + id 
                + "\nName: " + firstName + " " + lastName
                + "\nDepartment: " + department 
                + "\nPosition: " + position
                + "\nGender: " + gender
                + "\nDate of Birth: " + dateOfBirth
                + "\nSalary: " + salary);
    }
    
    @Override
    public String toString() {
        return "Employee{" + "firstName=" + firstName + ", lastName=" + lastName + ", department=" + department + 
                ", position=" + position + ", gender=" + gender + ", id=" + id + ", dateOfBirth=" + dateOfBirth + ", salary=" + salary + '}' + "\n";
    }
}
