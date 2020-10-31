/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem;

import java.util.*;

public class MenuClass {

    Scanner scanner = new Scanner(System.in);
    boolean backToMain = true;
    ManagementMenu menu = new ManagementMenu();
    StatisticalMenu menu1 = new StatisticalMenu();
    boolean testing = true;

    public void calling() {
        while (backToMain) {            
            switchNrOne(menuNrOne());
        }
    }

    public int menuNrOne() {
        int userChoice = 0;
        boolean isInt = true;
        
        while (isInt) {
            System.out.println("\nWelcome to EmployeeManagementSystem"
                    + "\n1: Employee managment"
                    + "\n2: Employee statistics"
                    + "\n0: Exit program");
            System.out.print("Make a choice: ");

            if (scanner.hasNextInt()) {
                if (userChoice >= 0 && userChoice < 3) {
                    userChoice = scanner.nextInt();
                    isInt = false;
                } else {
                    System.out.println("\nSelect an integer between 0-3");
                }
            } else {
                System.out.println("\nSelect an integer");
                scanner.next();
            }
        }

        return userChoice;
    }

    public void switchNrOne(int userChoice) {
        switch (userChoice) {
            case 1:
                testing = true;
                while (testing) {
                    switchNrTwo(menuNrTwo());
                }
                break;
            case 2:
                testing = true;
                while (testing) {
                    switchNrThree(menuNrThree()); 
                }
                break;
            case 0:
                System.out.println("Thank you for using EmployeeManagementSystem ");
                backToMain = false;
                break;
            default:
                System.out.println("Wrong input!");
        }
    }

    public int menuNrTwo() {
        int userChoice = 0;
        boolean isInt = true;
        while (isInt) {

            System.out.println("\n1: Register new employee"
                    + "\n2: Remove employee"
                    + "\n3: Update name of employee"
                    + "\n4: Update department of employee"
                    + "\n5: Update salary of employee"
                    + "\n6: Search employee by lastname"
                    + "\n7: Search employee by ID"
                    + "\n8: Search employee by department"
                    + "\n9: Display all employees"
                    + "\n10: Register bonus"
                    + "\n0: Back to main menu");
            System.out.print("Make a choice: ");

            if (scanner.hasNextInt()) {
                if (userChoice >= 0 && userChoice < 11) {
                    userChoice = scanner.nextInt();
                    isInt = false; 
                } else {
                    System.out.println("\nSelect an integer between");
                    scanner.next();
                }
            } else {
                System.out.println("\nSelect an integer");
                scanner.next();
            }
        }

        return userChoice;
    }
    
    public void switchNrTwo(int userChoice) {
        switch (userChoice) {
            case 1:
                menu.registerNewEmployee();
                break;
            case 2:
                menu.removeEmployee();
                break;
            case 3:
                menu.updateName();
                break;
            case 4:
                menu.updateDepartment();
                break;
            case 5:
                menu.updateSalary();
                break;
            case 6:
                menu.searchLastName();
                break;
            case 7:
                menu.searchId();
                break;
            case 8:
                menu.searchDepartment();
                break;
            case 9:
                menu.displayAllEmployees();
                break;
            case 10:
                menu.registerBonus();
                break;
            case 0:
                exitMenu();
                break;
            default:
                System.out.println("Wrong input!");
        }
    }

    public int menuNrThree() {
        int userChoice = 0;
        boolean isInt = true;
        
        while (isInt) {
            System.out.println("\n1: Average wage at the company"
                    + "\n2: Highest salary at the company"//Johanna
                    + "\n3: Lowest salary at the company"
                    + "\n4: Gender in percentage in the company" //Martina
                    + "\n0: Back to main menu");
            System.out.print("Make a choice: ");

            if (scanner.hasNextInt()) {
                if (userChoice >= 0 && userChoice < 5) {
                    userChoice = scanner.nextInt();
                    isInt = false;
                } else {
                    System.out.println("\nSelect an integer between 0-4");
                }
            } else {
                System.out.println("\nSelect an integer");
                scanner.next();
            }
        }

        return userChoice;
    }
    
    public void switchNrThree(int userChoice) {
        
        switch (userChoice) {
            case 1:
                menu1.AverageWage(menu.getAllEmployees());
                break;
            case 2:
                menu1.highestWage(menu.getAllEmployees());
                break;
            case 3:
                menu1.lowestWage(menu.getAllEmployees());
                break;
            case 4:
                menu1.showGenderInProcentage(menu.getAllEmployees());
                break;
            case 0:
                exitMenu();
                break;
            default:
                System.out.println("Wrong input!");
        }
    }
    
    public void exitMenu() {
        testing = false;
        System.out.println("\nBack to main menu");
    }
}
