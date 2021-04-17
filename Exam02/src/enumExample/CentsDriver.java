/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumExample;

/**
 *
 * @author Ramu Vallapurapu
 */
public class CentsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for Question 7: Ramu Vallapurapu");
        for (Cents c : Cents.values()) {
            System.out.println(c);
        }

    }

}
