/*
 * Factorial.java
 * find the factorial of a number
 * by christopher mccauley
 */

package factorial;

import java.util.Scanner; 
import java.text.NumberFormat;

/**
 * prompts for value then performs factorial calculation and displays result
 */
public class Factorial {

    public static void main(String[] args) {
        int userNum;
        int factorial = 1;
        Scanner userInput = new Scanner(System.in);
        NumberFormat numFormat = NumberFormat.getNumberInstance();
        
        do {
            System.out.print("Enter a positive integer to display the factorial: ");
            userNum = userInput.nextInt();
            if (userNum >= 0) {
                for (int i = 1; i <= userNum; i++) {
                factorial = factorial * i;
                }
            }
        } while (userNum < 0);
        System.out.println("The factorial of " + userNum + " is " + numFormat.format(factorial) + ".");
    }
}