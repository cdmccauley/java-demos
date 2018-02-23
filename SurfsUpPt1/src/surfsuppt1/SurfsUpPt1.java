/*
 * SurfsUpPt1.java
 * display a message about surfing conditions
 * by christopher mccauley
 */

package surfsuppt1;

import java.util.Scanner;

/**
 * evaluates user input and returns a message
 */
public class SurfsUpPt1 {

    public static void main(String[] args) {
        double waveHeight;
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("How are the waves today?\nEnter wave height in feet: ");
        waveHeight = userInput.nextDouble();
        if (waveHeight >= 6) {
            System.out.println("Great day for surfing!");
        }
    }

}