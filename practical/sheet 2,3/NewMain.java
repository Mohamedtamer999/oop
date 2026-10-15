/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication79;

import java.util.Scanner;

/**
 *
 * @author STUDENT
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                /*System.out.print("Enter number to check if divisible by 3 or 5 or both: ");
        int num = input.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Divisible by both 3 and 5");
        } else if (num % 3 == 0) {
            System.out.println("Divisible by 3");
        } else if (num % 5 == 0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not Divisible by 3 or 5");
        }*/
           Scanner input = new Scanner(System.in);


 
/*System.out.print("Enter month number (1-12): ");
        int month = input.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;

            default:
                System.out.println("Invalid month number");
        }

        input.close();*/
        
        /*System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else if ((ch >= 'A' && ch <= 'Z') ||
                   (ch >= 'a' && ch <= 'z')) {
            System.out.println("Letter");
        } else {
            System.out.println("Other");
        }

        input.close();*/
              
              
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        input.close();
        
        

//        int n = input.nextInt();
//        int reversed = 0;
//
//        while (n > 0) {
//            int digit = n % 10;
//            reversed = reversed * 10 + digit;
//            n = n / 10;
//        }
//
//        System.out.println(reversed);
//
//        input.close();
//        
        
    }
    
}
