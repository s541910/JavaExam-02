/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexample09;

/**
 *
 * @author Ramu Vallapurapu
 */
public class Son implements Mother, Father {

    int sum = Father.mark + Mother.mark;

    @Override
    public void add() {
        System.out.println("Roll = " + Father.roll);
    }

    @Override
    public void disp() {
        System.out.println("Total Mark =" + sum);
    }

}
