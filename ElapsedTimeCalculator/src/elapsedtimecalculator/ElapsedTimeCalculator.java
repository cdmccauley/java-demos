/*
 * ElapsedTimeCalculator.java
 * find what the time will be after an elapsed amount of hours
 * by christopher mccauley
 */

package elapsedtimecalculator;

import java.util.Scanner;
import java.lang.String;

/**
 * get valid input then calculate what the time will be after specified hours
 */
public class ElapsedTimeCalculator {

    public static void main(String[] args) {
        int startHour, addHour;
        String meridiem = new String();
        Scanner userInput = new Scanner(System.in);
        
        do {
            System.out.print("Enter the starting hour: ");
            startHour = userInput.nextInt();
            if (startHour < 1 || startHour > 12) {
                System.out.println("Input invalid, enter a number between 1 and 12.");
            }
        } while (startHour < 1 || startHour > 12);
        if (startHour == 12) { // when using a 12 hour time format, 12 means 0
            startHour = 0;
        }
        do {
            System.out.print("Enter am or pm: ");
            meridiem = userInput.next();
        } while (!(meridiem.equals("pm")) && !(meridiem.equals("am")));
        do {
            System.out.print("Enter the number of elapsed hours: ");
            addHour = userInput.nextInt();
            if (addHour < 0) {
                System.out.println("Invalid number, please use a positive integer.");
            }
        } while (addHour < 0);
        startHour += addHour;
        while (startHour > 12) {
            startHour -= 12;
            if (meridiem.equals("am")) {
                meridiem = "pm";
            } else {
                meridiem = "am";
            }
        }
        System.out.println("The time is: " + startHour + ":00 " + meridiem);
    }
}