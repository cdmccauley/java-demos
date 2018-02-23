/*
 * Stages.java
 * displays commonly used age classifications
 * by christopher mccauley
 */

package stages;

import java.util.Scanner;

/**
 * find range that a value belongs to and output message
 */
public class Stages {

    public static void main(String[] args) {
        int personsAge;
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter an age: ");
        personsAge = userInput.nextInt();
        
        if (personsAge >= 18) {
            System.out.println("adult");
        } else if (personsAge <= 5) {
                System.out.println("toddler");
            } else if (personsAge <= 10) {
                System.out.println("child");
            } else if (personsAge <= 12) {
                System.out.println("preteen");
            } else {
                System.out.println("teen");
            }
    }

}