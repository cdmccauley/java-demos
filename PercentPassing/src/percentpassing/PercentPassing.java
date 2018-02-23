/*
 * PercentPassing.java
 * enter scores to calculate the percentage of them that received a passing score
 * by christopher mccauley
 */

package percentpassing;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 * prompts for input till an invalid value is entered then outputs results
 */
public class PercentPassing {

    public static void main(String[] args) {
        final double PASSING_SCORE = 70.0;
        double entryValue = 0.0;
        int entryCount = 0;
        int numberPassing = 0;
        Scanner userInput = new Scanner(System.in);
        NumberFormat toPercent = NumberFormat.getPercentInstance();
        
        System.out.println("Enter a number less than 0 or greater than 100 to execute calculation.");
        while (entryValue >= 0.0 && entryValue <= 100.0) {
            System.out.print("Enter a score (0-100): ");
            entryValue = userInput.nextDouble();
            entryCount++;
            if (entryValue >= PASSING_SCORE && entryValue <= 100.0) {
                numberPassing++;
            }
        }
        entryCount--;
        System.out.println(toPercent.format((double)numberPassing / (double)entryCount) 
                + " of scores are passing. (" + numberPassing + "/" + entryCount + ")");
    }

}