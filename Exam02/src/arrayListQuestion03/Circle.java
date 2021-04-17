/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayListQuestion03;

/**
 *
 * @author Ramu Vallapurapu
 */
public class Circle {

    private int radius;
    private int diameter;

    public Circle(int radius, int diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", diameter=" + diameter + '}';
    }

}
