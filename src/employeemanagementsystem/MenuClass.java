package employeemanagementsystem;

import java.io.IOException;
import java.io.*;
import java.util.*;

public class MenuClass implements Serializable{
 
    transient Scanner scanner = new Scanner(System.in);               //  Skapar klass så Scanner kan användas för att få in user input
    boolean backToMain = true;                              //  
    ManagementMenu menu = new ManagementMenu();             //  Skapar klass så att vi kan komma åt ManagementMenu här ifrån
    StatisticalMenu menu1 = new StatisticalMenu();          //  Skapar klass så att vi kan komma åt StatisticalMenu här ifrån
    boolean testing = true;                                 //

    public void calling() throws IOException, ClassNotFoundException {                                  
        while (backToMain) {                                //  Till så att vi kan fortsätta loopa menuNrOne utan att stänga av programmet
            switchNrOne(menuNrOne());                       //  Kallar på switchNrOne som behöver en int så den hoppar till menuNrOne för att få en int
        }
    }

    public int menuNrOne() {                                
        int userChoice = 0;
        boolean isInt = true;                               // Här för att man ska kunna loopa i menyn
        
        while (isInt) {
            System.out.println("\nWelcome to EmployeeManagementSystem"
                    + "\n1: Employee managment"
                    + "\n2: Employee statistics"
                    + "\n0: Exit program");
            System.out.print("Make a choice: ");

            if (scanner.hasNextInt()) {                     // Tar user input och kollar så att användaren skriver in en int. Om ingen int skrivs in så hoppar den till else
                if (userChoice >= 0 && userChoice < 3) {    // OM userChoice är en int så kollar man om int'en är större eller 0 och mindre än 3 
                    userChoice = scanner.nextInt();         // Gör om scanner till userChoice.
                    isInt = false;                          // Stänger av loopen för denna meny
                } else {
                    System.out.println("\nSelect an integer between 0-3");
                }
            } else {
                System.out.println("\nSelect an integer");
                scanner.next();
            }
        }

        return userChoice;                                  // Returnerar en int till switchNrOne
    }

    public void switchNrOne(int userChoice) throws IOException, ClassNotFoundException {               // Tar emot en int
        switch (userChoice) {
            case 1:
                testing = true;
                while (testing) {
                    switchNrTwo(menuNrTwo());               // Kallar på switchNrTwo men den har ingen int än så då kommer använder in i menuNrTwo för att fixa en int
                }
                break;
            case 2:
                testing = true;
                while (testing) {
                    switchNrThree(menuNrThree());           // Kallar på switchNrThree men den har ingen int än så då kommer använder in i menuNrThree för att fixa en int
                }
                break;
            case 0:                                         // Om int från menuNrOne = 0 så stängs programmet av
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
    
    public void switchNrTwo(int userChoice) throws IOException, ClassNotFoundException {
        switch (userChoice) {
            case 1:
                menu.registerNewEmployee();                         //  Kallar på registerNewEmployee i ManagementMenu classen
                break;
            case 2:
                menu.removeEmployee();                              //  
                break;
            case 3:
                menu.updateName();                                  //
                break;
            case 4:
                menu.updateDepartment();                            //
                break;
            case 5:
                menu.updateSalary();                                //
                break;
            case 6:
                menu.searchLastName();                              //
                break;
            case 7:
                menu.searchId();                                    //
                break;
            case 8:
                menu.searchDepartment();                            //
                break;
            case 9:
                menu.displayAllEmployees();                        //
                break;
            case 10:
                menu.registerBonus();                               //
                break;
            case 0:
                exitMenu();                                         // Kallar på metoden exitMenu i denna class
                break;
            default:
                System.out.println("Wrong input!");
        }
    }

    public int menuNrThree() {                                      // 
        int userChoice = 0;
        boolean isInt = true;
        
        while (isInt) {
            System.out.println("\n1: Average wage at the company"
                    + "\n2: Highest salary at the company"
                    + "\n3: Lowest salary at the company"
                    + "\n4: Gender in percentage in the company" 
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
    
    public void switchNrThree(int userChoice) {                     // Får sin int ifrån menuNrThree
        
        switch (userChoice) {
            case 1:
                menu1.AverageWage(menu.getAllEmployees());          // Kallar på StatisticalMenu och AverageWage constructorn där under samt får tillgång till Employee arraylisten
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
