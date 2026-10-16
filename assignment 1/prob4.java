/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Mavenproject2 {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        int totalDays = scanner.nextInt();

        int weeks = totalDays / 7;
        int remainingDays = totalDays % 7;

        System.out.println(weeks + " weeks and " + remainingDays + " days.");

        scanner.close();
    }
}