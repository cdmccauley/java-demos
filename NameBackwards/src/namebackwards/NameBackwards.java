/*
 * NameBackwards.java
 * enter a name to see it in reverse
 * by christopher mccauley
 */

package namebackwards;

import java.util.Scanner;

public class NameBackwards {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String originalName;
        String backwardsName = new String();
        char[] dividedName;
        
        System.out.print("Enter a name: ");
        originalName = userInput.nextLine();
        dividedName = originalName.toCharArray();
        
        for (int i = dividedName.length - 1; i >= 0; i--) {
            backwardsName += dividedName[i];
        }
        System.out.println(backwardsName);
    }
}