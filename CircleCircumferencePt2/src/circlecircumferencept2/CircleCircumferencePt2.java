/*
 * CircleCircumferencePt2.java
 * display the circumference of a circle
 * by christopher mccauley
 */

package circlecircumferencept2;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * calculates the circumference of a radius
 */
public class CircleCircumferencePt2 {

    public static void main(String[] args) {
        final double PI = 3.14;
        double circleRadius;
        double circleCircumference;
        Scanner userInput = new Scanner(System.in);
        DecimalFormat resultFormat = new DecimalFormat("###,###.##");
        
        System.out.println("Input radius of circle: ");
        circleRadius = userInput.nextDouble();
        if (circleRadius < 0) {
            System.out.println("Negative radii are illegal.");
        } else {
            circleCircumference = 2 * PI * circleRadius;
            System.out.println("The circle's circumference is " + resultFormat.format(circleCircumference));
        }
        int size = 100, weight = 50, value = 75;
        if (value < 100 && !(weight == 50)) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }

}