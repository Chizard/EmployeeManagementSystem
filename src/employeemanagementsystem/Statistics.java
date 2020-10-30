package employeemanagementsystem;

import java.util.ArrayList;

public class Statistics {

    public void AverageWage(ArrayList<Employee> employee) {         // lägger in ArrayList så vi kan hitta employee
        int sum = 0;

        for (int i = 0; i < employee.size(); i++) {
            sum += employee.get(i).getSalary();
        }
        sum = sum / employee.size();
        System.out.println("The average wage is: " + sum);
    }

}
