/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayListQuestion03;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ramu Vallapurapu
 */
public class ArrayListDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for Question3 : Ramu Vallapurapu");
        ArrayList<Object> list = new ArrayList<>();
        Date date = new Date();
        Loan loan = new Loan("Educational", 2000000.00);
        Circle circle = new Circle(40, 20);
        String name = "Ramu Vallapurapu";

        list.add(loan);
        list.add(date);
        list.add(name);
        list.add(circle);

        for (Object l : list) {

            System.out.println(l.toString());
        }
    }

}
