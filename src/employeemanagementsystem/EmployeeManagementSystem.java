package employeemanagementsystem;

import java.util.*;
import java.io.*;

public class EmployeeManagementSystem {
    
    static Scanner scanner = new Scanner(System.in);
     
    public static void main(String[] args) {
        MenuClass m = new MenuClass();              //Skapar objektet m med hjälp av MenuClass för att komma åt construktor och liknande där i
        m.calling();                                // Använder objektet m för att kalla på calling construktorn i MenuClass
        ManagementMenu manaMenu = new ManagementMenu();
        
        //try {
            
        //    FileOutputStream fileOut = new FileOutputStream("emp.ser");
        //    ObjectOutputStream out = new ObjectOutputStream(fileOut);
        //    out.writeObject(manaMenu);
        //    out.close();
        //    fileOut.close();
        //    System.out.println("Saved!");
            
       // } catch (Exception e) {
       // }
        
    }
}
