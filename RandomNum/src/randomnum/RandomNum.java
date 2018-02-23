/*
 * RandomNum.java
 * generates a random integer within specified range
 * by christopher mccauley
 */

package randomnum;

import java.util.Scanner;
import java.lang.Math;

/**
 * prompts for range and generates random number within range
 */
public class RandomNum {

    public static void main(String[] args) {
        int num1, num2;
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Generate random number within custom range.\nInput first number for range: ");
        num1 = userInput.nextInt();
        System.out.print("Input second number for range: ");
        num2 = userInput.nextInt();
        
        if (num1 < num2) {
            System.out.println("Result: " + (int)((num2 - num1 + 1) * Math.random() + num1));
        } else {
            System.out.println("Result: " + (int)((num1 - num2 + 1) * Math.random() + num2));
        }
    }

}