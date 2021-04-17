/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualDetails;

import java.util.Date;

/**
 *
 * @author Ramu Vallapurapu
 */
public class Staff extends Employee {

    private String title;

    public Staff(String title, String office, double salary, Date dateHired, String name, String address, String phoneNumber, String emailAdress) {
        super(office, salary, dateHired, name, address, phoneNumber, emailAdress);
        this.title = title;
    }

    public Staff(String name) {

        super(name);
    }

    @Override
    public String toString() {

        return "Staff Class \nName of Staff: " + super.getName();
    }

}
