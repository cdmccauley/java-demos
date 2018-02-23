/*
 * DistancePart2.java
 * display the total distance of a race with 3 segments
 * by christopher mccauley
 */

package distancepart2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * calculate then display total distance in kilometers from user input
 */
public class DistancePart2 {

    public static void main(String[] args) {
        double first;
        double second;
        double third;
        double totalDistance;
        DecimalFormat roundedResult = new DecimalFormat("##,###.##");
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter distance of first segment (km): ");
        first = input.nextDouble();
        System.out.println("Enter distance of second segment (km): ");
        second = input.nextDouble();
        System.out.println("Enter distance of third segment (km): ");
        third = input.nextDouble();
        totalDistance = first + second + third;
        System.out.println("The total distance of the race is " + roundedResult.format(totalDistance) + " km");
    }

}