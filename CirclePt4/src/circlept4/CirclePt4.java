/*
 * CirclePt4.java
 * class and object demonstration
 * by christopher mccauley
 */

package circlept4;

public class CirclePt4 {

    /**
     * create and display information about a circle
     */
    public static void main(String[] args) {
        Circle spot = new Circle(5);
        Circle spot2 = new Circle();
        
        //spot.setRadius(3);
        System.out.println("spot radius: " + spot.getRadius() 
                        + "\nspot2 radius: " + spot2.getRadius());
        System.out.println("spot circumference: " + spot.circumference() 
                        + "\nspot2 circumference: " + spot2.circumference());
        spot.displayAreaFormula();
        System.out.println("spot.toString(): " + spot.toString() 
                        + "\nspot2.toString(): " + spot2.toString());
        if (spot.equals(spot2)) {
            System.out.println("spot is equal to spot2.");
        } else {
            System.out.println("spot is not equal to spot2.");
        }
    }
}