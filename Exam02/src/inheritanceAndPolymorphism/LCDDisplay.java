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
public class LCDDisplay extends Display {

    public LCDDisplay(int cost, double inches) {
        super(cost, inches);
    }

    @Override
    public void display() {
        System.out.println("Thanks for Choosing Our LCD Display");
    }

}
