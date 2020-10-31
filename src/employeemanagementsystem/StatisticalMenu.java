
package employeemanagementsystem;

import java.util.ArrayList;

 
public class StatisticalMenu {
    /*
                    + "\n4: Total bonus"
    
                    + "\n0: Back to main menu"*/
    
    public void AverageWage(ArrayList<Employee> employee) {         // lägger in ArrayList så vi kan hitta employee
        int sum = 0;

        for (int i = 0; i < employee.size(); i++) {
            sum += employee.get(i).getSalary();
        }
        sum = sum / employee.size();
        System.out.println("The average wage is: " + sum);
    }
    
    public void showGenderInProcentage(ArrayList<Employee> employee){
        double countFemale = 0;
        double countMale = 0;
        double sumFemale;
        double sumMale;
        for (int i = 0; i < employee.size(); i++) {
            if (employee.get(i).getGender().equalsIgnoreCase("female")) {
                countFemale++;
            } else {
                countMale++;
            }
        }
        sumFemale = countFemale / employee.size() * 100;
        sumMale = countMale / employee.size() * 100;
        System.out.println("The procentage of female employees is: " + sumFemale + "%");
        System.out.println("The procentage of male employees is: " + sumMale + "%");
    }
    
    public void highestWage(ArrayList<Employee> employee) {
        int higest = 0;
        
        for (int i = 0; i < employee.size(); i++) {
            if (employee.get(i).getSalary() > higest) {
                higest = employee.get(i).getSalary();
            }
        }
        System.out.println("The higest wage is: " + higest);
    }
    
    public void lowestWage(ArrayList<Employee> employee) {
        int lowest = 0;
        
        for (int i = 0; i < employee.size(); i++) {
            if (employee.get(i).getSalary() < lowest || lowest == 0) {
                lowest = employee.get(i).getSalary();
            }
        }
        System.out.println("The lowest wage is: " + lowest);
    }
}
