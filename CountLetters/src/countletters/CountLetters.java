/*
 * CountLetters.java
 * counts the occurences of letters in a phrase
 * by christopher mccauley
 */

package countletters;

import java.util.Scanner;

public class CountLetters {

    public static void main(String[] args) {
        final int LOW = 'A';
        final int HIGH = 'Z';
        int[] letterCounts = new int[HIGH - LOW + 1];
        Scanner input = new Scanner(System.in);
        String phrase;
        char[] phraseLetters;
        int offset;
        
        /* prompt user for a word */
        System.out.print("Enter a word: ");
        phrase = input.nextLine();
        
        /* convert phrase to char array and count only letter occurrences */
        phrase = phrase.toUpperCase();
        phraseLetters = phrase.toCharArray();
        for (int letter = 0; letter < phraseLetters.length; letter++) {
            if (phraseLetters[letter] >= LOW && phraseLetters[letter] <= HIGH) {
                offset = phraseLetters[letter] - LOW;
                letterCounts[offset] += 1;
            }
        }
        
        /* show letter occurrences */
        for (int i = LOW; i <= HIGH; i++) {
            System.out.println((char)i + ": " + letterCounts[i - LOW]);
        }
    }
}