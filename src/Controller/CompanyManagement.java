/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Doctor;
import Model.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import static util.Input.inputString;

/**
 *
 * @author Admin
 */
public class CompanyManagement {
    static Scanner scanner = new Scanner(System.in);
    private Company company;

    public CompanyManagement() {
        company = new Company();
    }

    public void createDoctor(String name, String phone, String email, float coefficientSalary, int level, String major, float positionAllowance) {
        company.createEmployee(1, name, phone, email, coefficientSalary, level, major, positionAllowance, 0);
    }
    public void createNurse(String name, String phone, String email, float coefficientSalary, int overtimeHours) {
        company.createEmployee(2, name, phone, email, coefficientSalary, 0, "", 0, overtimeHours);
    }
    public void createEmployee() {
        System.out.print("Choose 1 to create Doctor, 2 to create Nurse: ");
        int employeeType = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee phone: ");
        String phone = scanner.nextLine();

        System.out.print("Enter employee email: ");
        String email = scanner.nextLine();

        System.out.print("Enter employee coefficients salary: ");
        float coefficientSalary = scanner.nextFloat();
        scanner.nextLine(); 

        if (employeeType == 1) {
            System.out.print("Enter employee level: ");
            int level = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter employee major: ");
            String major = scanner.nextLine();

            System.out.print("Enter employee position Allowance: ");
            float positionAllowance = scanner.nextFloat();
            scanner.nextLine(); 

            createDoctor(name, phone, email, coefficientSalary, level, major, positionAllowance);
        } else {
            System.out.print("Enter employee overtime hours: ");
            int overtimeHours = scanner.nextInt();
            scanner.nextLine();

            createNurse(name, phone, email, coefficientSalary, overtimeHours);
        }

        System.out.print("Do you want to continue create employee (Y/N)? ");
        String continueCreating = scanner.nextLine();
        if (!continueCreating.equalsIgnoreCase("Y")) {
            System.out.println("Return!");
        }
    }

       public void viewAllEmployeeInformation() {
        List<Employee> employees = company.displayEmployees();
        System.out.println("______EMPLOYEE INFORMATION______");
        for (Employee employee : employees) {
            String employeeType = (employee instanceof Doctor) ? "Doctor" : "Nurse";
            System.out.println("Employee type:" + employeeType + "\nName:"+ employee.getName()+"\nPhone:"+ employee.getPhone()+"\nSalary:"+ employee.calculateTotalSalary());
        }
    }
    
    public void viewEmployeeWithHighestTotalSalary() {
        Optional<Employee> employeeWithHighestSalary = company.getEmployeeWithHighestSalary();
        if (employeeWithHighestSalary.isPresent()) {
            Employee employee = employeeWithHighestSalary.get();
            String employeeType = (employee instanceof Doctor) ? "Doctor" : "Nurse";
            System.out.println("Employee type:" + employeeType + "\nName:"+ employee.getName()+"\nPhone:"+ employee.getPhone()+"\nSalary:"+ employee.calculateTotalSalary());
        } else {
            System.out.println("No employees found.");
        }
    }

    public void searchEmployeesByName() {
        ArrayList<Employee> searchResults;
        String name = inputString("Search name: ");
        searchResults = company.search(c -> c.getName().contains(name));
        if (searchResults.isEmpty()) {
            System.out.println("No matching customers found.");
        } else {
            System.out.println("Search results: ");
            for (Employee employee : searchResults) {
                System.out.println(employee);
            }
            System.out.println("Total: " + searchResults.size() + " employee(s)");
        }
    }
}
