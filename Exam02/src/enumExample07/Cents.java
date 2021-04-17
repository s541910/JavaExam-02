/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumExample07;

/**
 *
 * @author Ramu Vallapurapu
 */
public enum Cents {

    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);
    private final int centValue;

    private Cents(int centValue) {
        this.centValue = centValue;
    }

    public int getCentValue() {
        return centValue;
    }

    @Override
    public String toString() {
        return "Cents{" + "centValue=" + centValue + '}';
    }

}
