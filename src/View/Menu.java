/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.CompanyManagement;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menu {
    private CompanyManagement companyManagement;

    public Menu() {
        companyManagement = new CompanyManagement();
    }

    public void runApplication() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("________________HOSPITAL________");
            System.out.println("1. Create employee");
            System.out.println("2. Display employee information");
            System.out.println("3. Display employee information has the highest salary");
            System.out.println("4. Search by employee name");
            System.out.println("5. Exit");
            System.out.print("Please enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    companyManagement.createEmployee();
                    break;
                case 2:
                    companyManagement.viewAllEmployeeInformation();
                    break;
                case 3:
                    companyManagement.viewEmployeeWithHighestTotalSalary();
                    break;
                case 4:
                    companyManagement.searchEmployeesByName();
                    break;
                case 5:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);
    }
}
