/*
 * RemoveString.java
 * string manipulation demonstration
 * by christopher mccauley
 */

package removestring;

import java.util.Scanner;
import java.lang.String;

/**
 * prompts for string then value to be removed from said string
 */
public class RemoveString {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String userSentence = new String();
        String removePattern = new String();
        String editedString = new String();
        
        System.out.print("Enter a sentence: ");
        userSentence = userInput.nextLine();
        System.out.print("Enter a string: ");
        removePattern = userInput.nextLine();
        editedString = userSentence.replaceAll(removePattern, "");
        System.out.println(editedString);
        
    }
}