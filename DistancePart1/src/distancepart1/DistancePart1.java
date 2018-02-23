/*
 * DistancePart1.java
 * display the total distance of a race with 3 segments
 * by christopher mccauley
 */

package distancepart1;

import java.text.DecimalFormat;

/**
 * calculate then display total distance in kilometers
 */
public class DistancePart1 {

    public static void main(String[] args) {
        double first = 12.2;
        double second = 10.6;
        double third = 5.8;
        double totalDistance;
        DecimalFormat roundedResult = new DecimalFormat("##,###.##");
        
        totalDistance = first + second + third;
        System.out.println("The total distance of the race is " + roundedResult.format(totalDistance) + " km");
    }

}