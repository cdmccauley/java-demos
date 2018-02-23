/*
 * CirclePt1.java
 * class and object demonstration
 * by christopher mccauley
 */

package circlept1;

public class CirclePt1 {

    /**
     * create and display information about a circle
     */
    public static void main(String[] args) {
        Circle spot = new Circle();
        
        spot.setRadius(3);
        System.out.println("Circle radius: " + spot.getRadius());
        System.out.println("Circle circumference: " + spot.circumference());
    }
}