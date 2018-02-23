/*
 * Exponentiation.java
 * calculates exponentiation
 * by christopher mccauley
 */

package exponentiation;

import java.util.Scanner;
import java.text.NumberFormat;

public class Exponentiation {
    
    /**
     * calculates exponentiation of two values
     * pre: 2 doubles passed by main()
     * post: returns double to main()
     */
    public static double powerOf(double base, double exponent) {
        double result;
        
        result = Math.pow(base, exponent);
        return result;
    }

    /**
     * prompts for input, validates, then displays results
     */
    public static void main(String[] args) {
        double base, exponent, result;
        Scanner userInput = new Scanner(System.in);
        NumberFormat resultFormat = NumberFormat.getNumberInstance();
        
        do {
            System.out.print("Enter a base value: ");
            base = userInput.nextDouble();
            System.out.print("Enter an exponent value: ");
            exponent = userInput.nextDouble();
        } while (base < 0.0 || exponent < 0.0);
        result = powerOf(base, exponent);
        System.out.println(resultFormat.format(base) + " raised by the power of " 
                + resultFormat.format(exponent) + " is " + resultFormat.format(result) + ".");
    }

}