/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public abstract class Employee {
    private int id;
    private String name;
    private String phone;
    private String email;
    float coefficientSalary;
    private int typeEmployee;
    
    public Employee(){
        
    }

    public Employee(int id, String name, String phone, String email, float coefficientSalary, int typeEmployee) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.coefficientSalary = coefficientSalary;
        this.typeEmployee = typeEmployee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getcoefficientSalary() {
        return coefficientSalary;
    }

    public void setcoefficientSalary(float coefficientSalary) {
        this.coefficientSalary = coefficientSalary;
    }

    public int getTypeEmployee() {
        return typeEmployee;
    }

    public void setTypeEmployee(int typeEmployee) {
        this.typeEmployee = typeEmployee;
    }
    
    public abstract float calculateTotalSalary();

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", salary=" + coefficientSalary + ", typeEmployee=" + typeEmployee + '}';
    }
    
    
}
