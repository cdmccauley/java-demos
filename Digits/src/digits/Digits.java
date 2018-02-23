/*
 * Digits.java
 * display the tens and ones of a two digit number
 * by christopher mccauley
 */

package digits;

import java.util.Scanner;

/**
 * get two digit number and display tens and ones
 */
public class Digits {

    public static void main(String[] args) {
        int usersNumber;
        int tensPlace;
        int onesPlace;
        Scanner usersInput = new Scanner(System.in);
        
        System.out.println("Enter a two digit number: ");
        usersNumber = usersInput.nextInt();
        tensPlace = usersNumber / 10;
        onesPlace = usersNumber % 10;
        System.out.println("The number " + usersNumber + " consists of " + tensPlace + " tens and " + onesPlace + " ones.");
        
    }

}