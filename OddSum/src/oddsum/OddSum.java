/*
 * OddSum.java
 * calculate the sum of all odd numbers between one and a number
 * by christopher mccauley
 */

package oddsum;

import java.util.Scanner;

/**
 * get input and sum the odd numbers between the input and 1
 */
public class OddSum {

    public static void main(String[] args) {
        int userNum = 0;
        int oddSum = 0;
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        userNum = userInput.nextInt();
        
        if (userNum > 0) {  // handles positive input
            for (int i = 1; i <= userNum; i++) {
                if (!(i % 2 == 0)) {
                    System.out.println(i);
                    oddSum += i;
                }
            }
        } else {            // handles negative input
            for (int i = 1; i >= userNum; i--) {
                if (!(i % 2 == 0)) {
                    System.out.println(i);
                    oddSum += i;
                }
            }
        }
        System.out.println("The sum of all odd numbers from 1 to " + userNum + " is " + oddSum + ".");
    }
}