/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualDetails05;

import java.util.Date;

/**
 *
 * @author Ramu Vallapurapu
 */
public class Employee extends Person {

    private String office;
    private double salary;
    private Date dateHired;

    public Employee(String office, double salary, Date dateHired, String name, String address, String phoneNumber, String emailAdress) {
        super(name, address, phoneNumber, emailAdress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public Employee(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Employee Class \nName of Employee: " + super.getName();
    }

}
