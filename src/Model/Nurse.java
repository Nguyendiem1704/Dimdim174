/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Nurse extends Employee{
    private int overtimeHours;

    public Nurse(int id, String name, String phone, String email, float coefficientSalary, int overtimeHours) {
        super(id, name, phone, email, coefficientSalary, 2); 
        this.overtimeHours = overtimeHours;
    }

    @Override
    public float calculateTotalSalary() {
        return (coefficientSalary * 1650000) + (overtimeHours * 200000);
    }
    
}
