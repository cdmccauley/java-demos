/*
 * NumbersSum.java
 * demonstrate loops, counters, and accumulators
 * by christopher mccauley
 */

package numberssum;

import java.util.Scanner;

/**
 * get number, sum range of numbers from 1 to input, display results
 */
public class NumbersSum {

    public static void main(String[] args) {
        int sumTo;
        int sumOf = 0;
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter a number to sum it with the numbers between it and 1: ");
        sumTo = userInput.nextInt();
        if (sumTo > 0) {    // handles positive input
            for (int i = 1; i <= sumTo; i++) {
            System.out.println(i);
            sumOf += i;
            }
            System.out.println("Total: " + sumOf);
        } else {            // handles negative input
            for (int i = 1; i >= sumTo; i--) {
            System.out.println(i);
            sumOf += i;
        }
            System.out.println("Total: " + sumOf);
        }
        
        
    }

}