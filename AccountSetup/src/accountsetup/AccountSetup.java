/*
 * AccountSetup.java
 * string method demonstration
 * by christopher mccauley
 */

package accountsetup;

import java.util.Scanner;
import java.lang.String;

/**
 * prompt for username and password that is at least 8 characters then display them
 */
public class AccountSetup {

    public static void main(String[] args) {
        String x = "lots of words.";
        String y = "Lots of Words.";
        String z = "Two words.";
        
        System.out.println(x.endsWith("ds"));
        
        String userName = new String();
        String userPass = new String();
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter a user name: ");
        userName = userInput.next();
        do {
            System.out.print("Enter a password that is at least 8 characters: ");
            userPass = userInput.next();
        } while (userPass.length() < 8);
        System.out.println("Your user name is " + userName.toLowerCase() + " and your password is " + userPass.toLowerCase() + ".");
        
    }

}