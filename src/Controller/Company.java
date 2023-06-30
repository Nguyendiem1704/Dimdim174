/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Doctor;
import Model.Employee;
import Model.Nurse;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 *
 * @author Admin
 */
public class Company {
    private List<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public void createEmployee(int employeeType, String name, String phone, String email, float coefficientSalary, int level, String major, float positionAllowance, int overtimeHours) {
        int id = employees.size() + 1;
        Employee employee;
        if (employeeType == 1) {
            employee = new Doctor(id, name, phone, email, coefficientSalary, level, major, positionAllowance);
        } else {
            employee = new Nurse(id, name, phone, email, coefficientSalary, overtimeHours);
        }
        employees.add(employee);
    }

    public List<Employee> displayEmployees() {
        return employees;
    }

    public Optional<Employee> getEmployeeWithHighestSalary() {
        return employees.stream().max((e1, e2) -> Float.compare(e1.calculateTotalSalary(), e2.calculateTotalSalary()));
    }

     public ArrayList<Employee> search (Predicate<Employee> e){
        ArrayList<Employee> searchResults = new ArrayList<>();
        for (Employee employee : employees){
            if (e.test(employee)){
                searchResults.add(employee);
            } 
        }
        return searchResults;
    }
}
