/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions1and2;

import java.util.Scanner;

/**
 * @author Ramu Vallapurapu
 */
public class TwoDimensionalArray02 {

    public static void main(String[] args) {
        System.out.println("Answer for Question2: Ramu Vallapurapu");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int[][] m1 = new int[3][3];
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter list2: ");
        int[][] m2 = new int[3][3];
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                m2[i][j] = sc.nextInt();
            }
        }
        if (equals(m1, m2)) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        int count = 0;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (m1[i][j] != m2[i][j]) {
                    count++;
                }
            }
        }
        return count == 0;
    }
}
