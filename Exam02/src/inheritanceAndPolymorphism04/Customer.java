/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceAndPolymorphism04;

/**
 *
 * @author Ramu Vallapurapu
 */
public class Customer {

    private String name;
    private String mobileNumber;
    private String type;

    public Customer(String name, String mobileNumber, String type) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void welcome() {
        System.out.println("Welcome on Board");
    }

    @Override
    public String toString() {
        return "Customer" + "name=" + name + ", mobileNumber=" + mobileNumber + ", type=" + type;
    }

}
