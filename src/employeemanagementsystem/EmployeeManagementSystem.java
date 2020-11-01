package employeemanagementsystem;

import java.util.*;

public class EmployeeManagementSystem {
    
    static Scanner scanner = new Scanner(System.in);
     
    public static void main(String[] args) {
        MenuClass m = new MenuClass();              //Skapar objektet m med hjälp av MenuClass för att komma åt construktor och liknande där i
        m.calling();                                // Använder objektet m för att kalla på calling construktorn i MenuClass
        //ManagementMenu m = new ManagementMenu();
        //m.registerNewEmployee();
    }
}
