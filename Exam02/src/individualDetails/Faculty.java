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
public class Faculty extends Employee {

    private int officeHours;
    private int noOfTeachingSubjects;

    public Faculty(int officeHours, int noOfTeachingSubjects, String office, double salary, Date dateHired, String name, String address, String phoneNumber, String emailAdress) {
        super(office, salary, dateHired, name, address, phoneNumber, emailAdress);
        this.officeHours = officeHours;
        this.noOfTeachingSubjects = noOfTeachingSubjects;
    }

    public Faculty(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Faculty Class\nName of Faculty: " + super.getName();
    }

}
