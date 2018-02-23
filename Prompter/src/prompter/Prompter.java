/*
 * Prompter.java
 * demonstrate do-while loop
 * by christopher mccauley
 */

package prompter;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 * prompts user for range then asks for a number within range until one is provided
 */
public class Prompter {

    public static void main(String[] args) {
        double minValue, maxValue, userValue;
        Scanner userInput = new Scanner(System.in);
        NumberFormat numFormat = NumberFormat.getInstance();
        
        System.out.print("Enter minimum value for range: ");
        minValue = userInput.nextDouble();
        System.out.print("Enter maximum value for range: ");
        maxValue = userInput.nextDouble();
        do {
            System.out.print("Enter a value between " + numFormat.format(minValue) + " and " + numFormat.format(maxValue) + ": ");
            userValue = userInput.nextDouble();
        } while (userValue < minValue || userValue > maxValue);
        
    }

}