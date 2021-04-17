/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersinheritance10;

/**
 *
 * @author Ramu Vallapurapu
 */
public class Three extends Two {

    /**
     *
     * @param x
     * @return
     */
    @Override
    public int apply(int x){
        System.out.println("Three apply " + x);
        return -10;
    }
}
