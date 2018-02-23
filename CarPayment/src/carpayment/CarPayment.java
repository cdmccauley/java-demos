/*
 * CarPayment.java
 * calculate monthly car payments
 * by christopher mccauley
 */

package carpayment;

import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;

/**
 * get rates, calculate and display result
 */
public class CarPayment {

    public static void main(String[] args) {
        double principal, interest, months;
        Scanner userInput = new Scanner(System.in);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        
        System.out.print("Enter principal: ");
        principal = userInput.nextDouble();
        System.out.print("Enter interest rate: ");
        interest = userInput.nextDouble();
        System.out.print("Enter number of monthly payments: ");
        months = userInput.nextDouble();
        if (months < 1) {
            System.out.println("Invalid input. Number of monthly payments must be 1 or more.");
        } else {
            System.out.println("Principal: " + currencyFormat.format(principal));
            System.out.println("Interest Rate: " + percentFormat.format(interest));
            System.out.println("Number of monthly payments: " + (int)months);
            System.out.println("The monthly payment is " + currencyFormat.format((principal * (interest / 12)) / (1 - Math.pow((1 + interest / 12), (months * -1)))));
        }
    }

}