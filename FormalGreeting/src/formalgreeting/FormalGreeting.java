/*
 * FormalGreeting.java
 * string manipulation demonstration
 * by christopher mccauley
 */

package formalgreeting;

import java.util.Scanner;

/**
 * prompt for user name and display formal greeting when appropriate
 */
public class FormalGreeting {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String userName = new String();
        
        System.out.print("Enter your name including title: ");
        userName = userInput.nextLine();
        
        if (userName.startsWith("Mr.")) {
            System.out.print("Hello, sir.");
        } else if (userName.startsWith("Ms.") || userName.startsWith("Mrs.") || userName.startsWith("Miss")) {
            System.out.print("Hello, ma'am.");
        } else {
            System.out.print("Hello, " + userName + ".");
        }
        
    }

}