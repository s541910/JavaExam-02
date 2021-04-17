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
public class DisplayDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for Question 4: Ramu Vallapurapu");
        Display d = new Display(120, 20.5);
        Display d1 = new LCDDisplay(100, 10.5);
        Display d2 = new LEDDisplay(50, 50);
        System.out.println("------------------Display-------------------------------");
        d.cost();
        d.display();
        System.out.println("------------------------LCD Display--------------------");
        d1.cost();
        d1.display();
        System.out.println("----------------------------------LED Display---------------------");
        d2.cost();
        d2.display();
    }

}
