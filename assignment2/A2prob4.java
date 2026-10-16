/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.a2prob4;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class A2prob4 {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three sides: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a >= b + c || b >= a + c || c >= a + b) {
            System.out.println("Not a valid triangle");
        } else {
            if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
