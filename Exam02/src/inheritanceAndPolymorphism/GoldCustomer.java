/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceAndPolymorphism;

/**
 *
 * @author Ramu Vallapurapu
 */
public class GoldCustomer extends Customer {

    private int goldPrice;

    public GoldCustomer(int goldPrice, String name, String mobileNumber, String type) {
        super(name, mobileNumber, type);
        this.goldPrice = goldPrice;
    }

    /**
     *
     */
    @Override
    public void welcome() {
        System.out.println("Welcome on Board Gold Customer");
    }

    @Override
    public String toString() {
        return super.toString() + " " + ",goldPrice=" + goldPrice;
    }

}
