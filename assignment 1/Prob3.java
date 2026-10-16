/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prob3;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Prob3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int score1 = scanner.nextInt();
        int score2 = scanner.nextInt();
        int score3 = scanner.nextInt();

        double average = (score1 + score2 + score3) / 3.0;

        System.out.println(Math.round(average));
        System.out.printf("%.2f%n", average);

        scanner.close();
    }
}
   
