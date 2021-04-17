/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualDetails;

/**
 *
 * @author Ramu Vallapurapu
 */
public class Person {

    private String name;
    private String address;
    private String phoneNumber;
    private String emailAdress;

    public Person(String name, String address, String phoneNumber, String emailAdress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAdress = emailAdress;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person Class \nName Of Person:" + name;
    }

}
