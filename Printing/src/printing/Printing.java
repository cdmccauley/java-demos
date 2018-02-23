/*
 * Printing.java
 * determine unit cost and calculate total for copy services
 * by christopher mccauley
 */

package printing;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 * finds appropriate range and calculates a total
 */
public class Printing {

    public static void main(String[] args) {
        final double PRICE_0 = 0.00, PRICE_1 = 0.30, PRICE_2 = 0.28, PRICE_3 = 0.27, PRICE_4 = 0.26, PRICE_5 = 0.25;
        int totalCopies;
        double copyRate = 0.00;
        Scanner userInput = new Scanner(System.in);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        
        System.out.print("Enter the number of copies to be printed: ");
        totalCopies = userInput.nextInt();
        if (totalCopies >= 1001) {
            copyRate = PRICE_5;
        } else if (totalCopies <= 0) {
            copyRate = PRICE_0;
        } else if (totalCopies <= 99) {
            copyRate = PRICE_1;
        } else if (totalCopies <= 499) {
            copyRate = PRICE_2;
        } else if (totalCopies <= 749) {
            copyRate = PRICE_3;
        } else if (totalCopies <= 1000) {
            copyRate = PRICE_4;
        }
        System.out.println("Price per copy is: " + currencyFormat.format(copyRate));
        System.out.println("Total cost is: " + currencyFormat.format(totalCopies * copyRate));
    }

}