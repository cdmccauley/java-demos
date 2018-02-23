/*
 * Change.java
 * display quantity of coins needed to make a total
 * by christopher mccauley
 */

package change;

import java.util.Scanner;

/**
 * calculate which types of coins will be needed for a total
 */
public class Change {

    public static void main(String[] args) {
        int totalCents;
        int totalQuarters;
        int totalDimes;
        int totalNickels;
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter the change in cents: ");
        totalCents = userInput.nextInt();
        totalQuarters = totalCents / 25;
        totalCents = totalCents - (totalQuarters * 25);
        totalDimes = totalCents / 10;
        totalCents = totalCents - (totalDimes * 10);
        totalNickels = totalCents / 5;
        totalCents = totalCents - (totalNickels * 5);
        System.out.println("The minimum number of coins is:");
        System.out.println("\tQuarters: " + totalQuarters);
        System.out.println("\tDimes: " + totalDimes);
        System.out.println("\tNickels: " + totalNickels);
        System.out.println("\tPennies: " + totalCents);
    }

}