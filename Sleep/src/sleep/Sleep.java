/*
 * Sleep.java
 * display a rough estimate of hours spent sleeping in a lifetime
 * by christopher mccauley
 */

package sleep;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 * roughly calculate the days between two dates and time a person may have spent 
 * sleeping between those dates
 */
public class Sleep {

    public static void main(String[] args) {
        int birthYear;
        int birthMonth;
        int birthDay;
        int endYear;
        int endMonth;
        int endDay;
        int lifeDays = 0;
        int sleepHours;
        Scanner userInput = new Scanner(System.in);
        NumberFormat formatResult = NumberFormat.getNumberInstance();
        
        System.out.println("Enter your birthdate:");
        System.out.print("Year(YYYY): ");
        birthYear = userInput.nextInt();
        System.out.print("Month(MM): ");
        birthMonth = userInput.nextInt();
        System.out.print("Day(DD): ");
        birthDay = userInput.nextInt();
        System.out.println("Enter today's date:");
        System.out.print("Year(YYYY): ");
        endYear = userInput.nextInt();
        System.out.print("Month(MM): ");
        endMonth = userInput.nextInt();
        System.out.print("Day(DD): ");
        endDay = userInput.nextInt();
        lifeDays += (endYear - birthYear) * 365;
        lifeDays += (endMonth - birthMonth) * 30;
        lifeDays += endDay - birthDay;
        sleepHours = lifeDays * 8;
        System.out.println("You have been alive for " + formatResult.format(lifeDays) + " days.");
        System.out.println("You have slept " + formatResult.format(sleepHours) + " hours.");
        
    }

}