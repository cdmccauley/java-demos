/*
 * CircleCircumference.java
 * display the circumference of a circle
 * by christopher mccauley
 */

package circlecircumference;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * calculates the circumference of a radius
 */
public class CircleCircumference {

    public static void main(String[] args) {
        final double PI = 3.14;
        double circleRadius;
        double circleCircumference;
        Scanner userInput = new Scanner(System.in);
        DecimalFormat resultFormat = new DecimalFormat("###,###.##");
        
        System.out.println("Input radius of circle: ");
        circleRadius = userInput.nextDouble();
        circleCircumference = 2 * PI * circleRadius;
        System.out.println("The circle's circumference is " + resultFormat.format(circleCircumference));
        
    }

}