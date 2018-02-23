/*
 * HighestGrade.java
 * create list of scores then display the highest
 * by christopher mccauley
 */

package highestgrade;

import java.util.ArrayList;
import java.util.Scanner;

public class HighestGrade {

    public static void main(String[] args) {
        final int TOTAL_PROMPTS = 5;
        Scanner userInput = new Scanner(System.in);
        ArrayList<Integer> testScores = new ArrayList<Integer>();
        int highScore = 0;

        for (int i = 0; i < TOTAL_PROMPTS; i++) {
            do {
                System.out.print("Enter a test score: ");
                testScores.add(i, userInput.nextInt());
            } while (testScores.get(i).compareTo(0) < 0 
                    || testScores.get(i).compareTo(100) > 0);
            if (testScores.get(i).compareTo(highScore) > 0) {
                highScore = testScores.get(i);
            }
        }
        System.out.println("The highest score entered was: " + highScore);
    }
}