/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualDetails05;

/**
 *
 * @author Ramu Vallapurapu
 */
public class Student extends Person {

    private static final String STATUS = "Graduate";
    private double grade;
    

    public Student(double grade, String name, String address, String phoneNumber, String emailAdress) {
        super(name, address, phoneNumber, emailAdress);
        this.grade = grade;
    }

    public Student(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Student Class \nName of Student: " + super.getName();
    }

}
