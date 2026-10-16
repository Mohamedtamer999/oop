/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.a2prob2;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class A2prob2 {

    public static void main(String[] args) {   
     
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }

        scanner.close();
    }
}   
    

