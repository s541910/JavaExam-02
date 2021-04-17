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
public class CustomerDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for Question 4: Ramu Vallapurapu");
        Customer customer = new Customer("Ramu", "1234567890", "gold");
        Customer goldCustomer = new GoldCustomer(200, "preetham", "987654321", "gold");
        PlatinumCustomer platinumCustomer = new PlatinumCustomer(500, "nikhil", "4566544656", "platinum");

        System.out.println(customer.toString());
        customer.welcome();

        System.out.println(goldCustomer.toString());
        goldCustomer.welcome();

        System.out.println(platinumCustomer.toString());
        platinumCustomer.welcome();
    }

}
