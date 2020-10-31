package employeemanagementsystem;

import java.util.*;
import jdk.nashorn.internal.parser.TokenType;

public class ManagementMenu {

    ArrayList<Employee> employee = new ArrayList<>();
    ArrayList<NewInterface> develompentBonus = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public ArrayList<Employee> getAllEmployees() {
        return employee;
    }

    public void registerNewEmployee() {
        String firstName;
        String lastName;
        String gender = " ";
        String department = " ";
        String employment = " ";
        int salary = 0;
        int number;
        int dateOfBirth = 0;
        boolean isInt = true;

        System.out.println("Enter first name: ");
        firstName = scanner.nextLine();
        System.out.println("Enter last name: ");
        lastName = scanner.nextLine();

        while (isInt) {
            System.out.println("Salary of new employee: ");
            if (scanner.hasNextInt()) {
                salary = scanner.nextInt();
                scanner.nextLine();
                isInt = false;
            } else {
                System.out.println("\nTry again!\n");
                scanner.next();
            }
        }

        isInt = true;
        while (isInt) {
            System.out.println("Which gender do the employee have: ");
            gender = scanner.next();
            if (gender.equalsIgnoreCase("female")) {
                gender = "female";
                isInt = false;
            } else if (gender.equalsIgnoreCase("male")) {
                gender = "male";
                isInt = false;
            } else {
                System.out.println("\nSelect male or female\n");
            }
        }

        // Martina fixar kontroll på datumet
        int year;
        int month;
        int day;
        isInt = true;
        while (isInt) {
            System.out.println("Date of birth  (YYYYMMDD)");
            if (scanner.hasNextInt()) {
                dateOfBirth = scanner.nextInt();
                scanner.nextLine();
                day = dateOfBirth % 100;
                int temp = dateOfBirth / 100;
                month = temp % 100;
                year = temp / 100;
                int maxD = 31; //max dagar
                if (month == 4 || month == 6 || month == 9 || month == 11) //om månad är april eller juni eller sep eller nov isåfall är det max30
                {
                    maxD = 30;
                }
                if (month == 2) {
                    if (year % 4 == 0) {
                        maxD = 29;
                    } else {
                        maxD = 28;
                    }
                }
                Boolean correct = true; //utgångsläge att allt är rätt
                if (month < 1 || month > 12) {
                    correct = false;
                }
                if (day < 1 || day > maxD) {
                    correct = false;
                }
                ////kolla så det stämmer//
                if (correct) {
                    isInt = false;

                } else {
                    System.out.println(dateOfBirth + " is not correct, try again");
                }
            } else {
                System.out.println("\nTry again!\n");
                scanner.next();
            }

        }

        isInt = true;
        while (isInt) {
            System.out.println("Which department?"
                    + "\n1: Managment"
                    + "\n2: Development");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                scanner.nextLine();
                if (number == 1) {
                    department = "Managment";
                    isInt = false;
                } else if (number == 2) {
                    department = "Development";
                    isInt = false;
                } else {
                    System.out.println("\nSelect between 1-2\n");
                }
            } else {
                System.out.println("\nSelect an integer\n");
                scanner.next();
            }
        }

        isInt = true;
        while (isInt) {
            if (department.equalsIgnoreCase("Managment")) {
                System.out.println("Is the new employees 1: Managers or 2: Admin?");
                if (scanner.hasNextInt()) {
                    number = scanner.nextInt();
                    scanner.nextLine();
                    if (number == 1) {
                        employment = "Managers";
                        System.out.println("Manager created");
                        isInt = false;
                    } else if (number == 2) {
                        employment = "Admin";
                        System.out.println("Admin created");
                        isInt = false;
                    } else {
                        System.out.println("\nSelect between 1-2");
                    }
                } else {
                    System.out.println("\nSelect an integer\n");
                    scanner.next();
                }
            } else if (department.equalsIgnoreCase("Development")) {
                System.out.println("Is the new employees 1: Technician or 2: Programmer?");
                if (scanner.hasNextInt()) {
                    number = scanner.nextInt();
                    scanner.nextLine();
                    if (number == 1) {
                        employment = "Technician";
                        System.out.println("Technician created");
                        isInt = false;
                    } else if (number == 2) {
                        employment = "Programmer";
                        System.out.println("Programmer created");
                        isInt = false;
                    } else {
                        System.out.println("\nSelect between 1-2\n");
                    }
                } else {
                    System.out.println("\nSelect an integer\n");
                    scanner.next();
                }
            }
        }

        if (department.equalsIgnoreCase("Managment")) {
            Managment newEmployee = new Managment(firstName, lastName, department, lastName, gender, dateOfBirth, salary);
            employee.add(newEmployee);
        } else if (department.equalsIgnoreCase("Development")) {
            Development newDevelopment = new Development(firstName, lastName, department, lastName, gender, dateOfBirth, salary);
            employee.add(newDevelopment);
            develompentBonus.add(newDevelopment);
        }

        //Employee newEmployee = new Employee(firstName, lastName, department, employment, gender, dateOfBirth, salary);
        //employee.add(newEmployee);
    }

    public void displayAllEmployees() {
        System.out.println(employee);
    }

    public void removeEmployee() {
        int id;

        System.out.println("Enter the ID of the employee to remove");
        if (scanner.hasNextInt()) {
            id = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < employee.size(); i++) {
                if (employee.get(i).getId() == id) {
                    employee.remove(employee.get(i));
                }
            }
        }
    }

    public void updateName() {
        int id;

        System.out.println("Enter the ID of the employee to change name ");
        if (scanner.hasNextInt()) {
            id = scanner.nextInt();
            scanner.nextLine();
            for (Employee changeName : employee) {
                if (changeName.getId() == id) {
                    System.out.println("Enter first name: ");
                    String firstName = scanner.nextLine();
                    changeName.setFirstName(firstName);
                    System.out.println("Enter last name: ");
                    String lastName = scanner.nextLine();
                    changeName.setLastName(lastName);
                    System.out.println("Name has been updated!");
                } else {
                    System.out.println("Incorrect input");
                }
            }
        }
    }

    public void updateDepartment() {
        int id;
        int num;

        System.out.println("Enter the ID of the employee to change department");
        if (scanner.hasNextInt()) {
            id = scanner.nextInt();
            scanner.nextLine();
            for (Employee changeDepartment : employee) {
                if (changeDepartment.getId() == id) {
                    if (changeDepartment.getDepartment().equalsIgnoreCase("Managment")) {
                        changeDepartment.setDepartment("Development");
                        System.out.println("Department updatet to Development \nIs the employee 1: Technician or 2: Programmer?");
                        if (scanner.hasNextInt()) {
                            num = scanner.nextInt();
                            scanner.nextLine();
                            if (num == 1) {
                                changeDepartment.setPosition("Technician");
                                System.out.println("Position updated!");
                            } else if (num == 2) {
                                changeDepartment.setPosition("Programmer");
                                System.out.println("Position updated!");
                            } else {
                                System.out.println("Incorrect input");
                            }
                        }
                    } else {
                        changeDepartment.setDepartment("Managment");
                        System.out.println("Department updated to Managment \nIs the employee 1: Managers or 2: Admin?");
                        if (scanner.hasNextInt()) {
                            num = scanner.nextInt();
                            scanner.nextLine();
                            if (num == 1) {
                                changeDepartment.setPosition("Managers");
                                System.out.println("Position updated!");
                            } else if (num == 2) {
                                changeDepartment.setPosition("Admin");
                                System.out.println("Position updated!");
                            } else {
                                System.out.println("Incorrect input");
                            }
                        }
                    }

                }
            }
        }
    }

    public void updateSalary() {
        int id;
        int num;

        System.out.println("Enter the ID of the employee to change salary");
        if (scanner.hasNextInt()) {
            id = scanner.nextInt();
            scanner.nextLine();
            for (Employee changeSalary : employee) {
                if (changeSalary.getId() == id) {
                    System.out.println("Enter new salary: ");
                    num = scanner.nextInt();
                    scanner.nextLine();
                    changeSalary.setSalary(num);
                    System.out.println("Salary has been updated!");
                } else {
                    System.out.println("Incorrect input");
                }
            }
        }
    }

    public void searchLastName() {
        System.out.println("Enter last name to search: ");
        String lastName = scanner.nextLine();
        for (Employee searchEmployee : employee) {
            if (searchEmployee.getLastName().equalsIgnoreCase(lastName)) {
                System.out.println(searchEmployee);
            }
        }
    }

    public void searchId() {
        System.out.println("Enter ID to search: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Employee searchEmployee : employee) {
            if (searchEmployee.getId() == id) {
                System.out.println(searchEmployee);
            } else {
                System.out.println("incorrect input");
            }
        }
    }

    public void searchDepartment() {
        System.out.println("Enter department to search: (1: Managment || 2: Development");
        int num = scanner.nextInt();
        scanner.nextLine();
        for (Employee searchEmployee : employee) {
            if (num == 1) {
                if (searchEmployee.getDepartment().equalsIgnoreCase("Managment")) {
                    System.out.println(searchEmployee);
                }
            } else if (num == 2) {
                if (searchEmployee.getDepartment().equalsIgnoreCase("Development")) {
                    System.out.println(searchEmployee);
                }
            } else {
                System.out.println("Incorrect input");
            }
        }
    }

    public void registerBonus() {
        System.out.println("Is it crunch bonus time?");
        String yesOrNo = scanner.next();
        if (yesOrNo.equalsIgnoreCase("Yes")) {
            for (NewInterface bonus : develompentBonus) {
                bonus.crunchBonus();
            }
            System.out.println("\nCrunch bonus registered\n");
            System.out.println(develompentBonus);
        } else {
            for (Employee managment : employee) {
                managment.bonus();
            }
            System.out.println("Bonus registered ");
            System.out.println(employee);
        }
    }
}
