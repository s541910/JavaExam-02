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
public class PlatinumCustomer extends Customer {

    private int platinumPrice;

    public PlatinumCustomer(int platinumPrice, String name, String mobileNumber, String type) {
        super(name, mobileNumber, type);
        this.platinumPrice = platinumPrice;
    }

    /**
     *
     */
    @Override
    public void welcome() {
        System.out.println("Welcome on board platinum customer");
    }

    @Override
    public String toString() {
        return super.toString() + " " + ",platinumPrice=" + platinumPrice;
    }

}
