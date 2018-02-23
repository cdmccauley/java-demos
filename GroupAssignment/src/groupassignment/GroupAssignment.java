/*
 * GroupAssignment.java
 * string manipulation demonstration
 * by christopher mccauley
 */

package groupassignment;

import java.util.Scanner;
import java.lang.String;

/**
 * gets first and last name then assigns group dependent upon first letter of 
 * last name and lastly displays first, last, and group
 */
public class GroupAssignment {

    public static void main(String[] args) {
        String firstName = new String();
        String lastName = new String();
        String qualifier = new String();
        byte groupNum = 0;
        boolean displayOutput = true;
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter your first name: ");
        firstName = userInput.nextLine();
        System.out.print("Enter your last name: ");
        lastName = userInput.nextLine();
        qualifier = lastName.substring(0, 1);
        if (qualifier.compareToIgnoreCase("a") >= 0 && qualifier.compareToIgnoreCase("i") <= 0) {
            groupNum = 1;
        } else if (qualifier.compareToIgnoreCase("j") >= 0 && qualifier.compareToIgnoreCase("s") <= 0) {
            groupNum = 2;
        } else if (qualifier.compareToIgnoreCase("t") >= 0 && qualifier.compareToIgnoreCase("z") <= 0) {
            groupNum = 3;
        } else {
            System.out.println("Invalid first character of last name. Please try again.");
            displayOutput = false;
        }
        if (displayOutput) {
            System.out.println(firstName + " " + lastName + " is assigned to Group " + groupNum);
        }
    }
}