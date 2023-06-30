/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Doctor extends Employee{
    private int level;
    private String major;
    private float positionAllowance;

    public Doctor(int id, String name, String phone, String email, float coefficientSalary, int level, String major, float positionAllowance) {
        super(id, name, phone, email, coefficientSalary,1); 
        this.level = level;
        this.major = major;
        this.positionAllowance = positionAllowance;
    }

    @Override
    public float calculateTotalSalary() {
        return ((level + coefficientSalary) * 1650000) + positionAllowance;
    }

}
