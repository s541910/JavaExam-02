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
public class Display {

    private int cost;
    private double inches;

    public Display(int cost, double inches) {
        this.cost = cost;
        this.inches = inches;
    }

    public int getCost() {
        return cost;
    }

    public double getInches() {
        return inches;
    }

    public void display() {
        System.out.println("Thanks for Choosing Our Company Display");
    }

    public void cost() {
        System.out.println(cost * inches);
    }

}
