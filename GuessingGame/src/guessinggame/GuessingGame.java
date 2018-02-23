/*
 * GuessingGame.java
 * guess the computer's secret number to win
 * by christopher mccauley
 */

package guessinggame;

import java.util.Scanner;
import java.lang.Math;

/**
 * compares generated number to input number and outputs message
 */
public class GuessingGame {

    public static void main(String[] args) {
        int playerNumber, programNumber;
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter a number between 1 and 20: ");
        playerNumber = userInput.nextInt();
        programNumber = (int)(20 * Math.random() + 1);
        System.out.println("Computer's Number: " + programNumber);
        System.out.println("PLayer's Number: " + playerNumber);
        if (playerNumber == programNumber) {
            System.out.println("You won!");
        } else {
            System.out.println("Better luck next time.");
        }
        
    }

}