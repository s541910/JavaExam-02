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
public class RestaurantDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PlaceOrder p = new PlaceOrder();
        p.acceptOnlineOrder();
        p.takeTelephoneOrder();
        p.walkInCustomerOrder();
    }

}
