/*
 * NumberCounts.java
 * counts the occurrences of each digit in a number
 * by christopher mccauley
 */

package numbercounts;

import java.util.Scanner;

public class NumberCounts {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String initialValue;
        char[] parsedValue;
        int[] count = new int[10];
        final int offset = 48;
        
        System.out.print("Enter a number: ");
        initialValue = userInput.next();
        parsedValue = initialValue.toCharArray();
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < parsedValue.length; j++) {
                if (parsedValue[j] == i + offset) {
                    count[i] += 1;
                }
            }
            System.out.println(i + ": " + count[i]);
        }
    }
}