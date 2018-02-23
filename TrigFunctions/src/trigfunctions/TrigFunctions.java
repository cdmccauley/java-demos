/*
 * TrigFunctions.java
 * find and display sine, cosine, and tangent for an angle
 * by christopher mccauley
 */

package trigfunctions;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

/**
 * calculate sine, cosine, and tangent for angle
 */
public class TrigFunctions {

    public static void main(String[] args) {
        double angleDegrees;
        double angleRadians;
        Scanner userInput = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        
        System.out.print("Enter an angle in degrees: ");
        angleDegrees = userInput.nextDouble();
        angleRadians = Math.toRadians(angleDegrees);
        System.out.println("Sine: " + decimalFormat.format(Math.sin(angleRadians)));
        System.out.println("Cosine: " + decimalFormat.format(Math.cos(angleRadians)));
        System.out.println("Tangent: " + decimalFormat.format(Math.tan(angleRadians)));
    }

}