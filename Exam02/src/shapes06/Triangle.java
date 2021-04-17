/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes06;

/**
 *
 * @author Ramu Vallapurapu
 */
public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;
    private boolean isFilled;
    private String color;

    public Triangle(double side1, double side2, double side3, boolean isFilled, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.isFilled = isFilled;
        this.color = color;
    }

    public boolean isIsFilled() {
        return isFilled;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getPerimeter() {
        return (this.side1 + this.side2 + this.side3);

    }

    @Override
    public double getArea() {
        double p = this.getPerimeter();
        return (Math.sqrt((p - this.side1) * (p - this.side2)
                * (p - this.side3) * p));
    }

    @Override
    public String toString() {
        return "Area: " + this.getArea() + "\nPerimeter: " + this.getPerimeter()
                + "\nColor:" + this.getColor()
                + "\nFilled: " + this.isIsFilled();

    }

}
