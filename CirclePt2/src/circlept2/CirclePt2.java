/*
 * CirclePt2.java
 * class and object demonstration
 * by christopher mccauley
 */

package circlept2;

public class CirclePt2 {

    /**
     * create and display information about a circle
     */
    public static void main(String[] args) {
        Circle spot = new Circle(5);
        
        //spot.setRadius(3);
        System.out.println("Circle radius: " + spot.getRadius());
        System.out.println("Circle circumference: " + spot.circumference());
    }
}