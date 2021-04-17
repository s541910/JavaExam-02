/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions1and2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ramu Vallapurapu
 */
public class DuplicateElements01 {

    public static void main(String args[]) {
        System.out.println("Answer for Question1: Ramu Vallapurapu");
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            al.add(sc.nextInt());
        }
        removeDuplicate(al);
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (Integer l : list) {
            if (!temp.contains(l)) {
                temp.add(l);
            }
        }
        System.out.print("The distinct integers are ");
        for (Integer i : temp) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
