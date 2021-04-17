/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexample;

/**
 *
 * @author Ramu Vallapurapu
 */
public class PlaceOrder implements RestaurantInterface {

    @Override
    public void acceptOnlineOrder() {
        System.out.println("Thanks for Ordering through Online");
    }

    @Override
    public void takeTelephoneOrder() {
        System.out.println("Thanks for Ordering through Telephone");
    }

    @Override
    public void walkInCustomerOrder() {
        System.out.println("Thanks for Ordering at Restaurant Location");
    }

}
