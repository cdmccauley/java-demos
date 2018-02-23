/*
 * RectanglePerimeter.java
 * display a rectangle's perimeter
 * by christopher mccauley
 */

package rectangleperimeter;

/**
 * calculates a rectangle's perimeter based on length and width
 */
public class RectanglePerimeter {

    public static void main(String[] args) {
        int length = 13;
        int width = 4;
        int perimeter;
        
        perimeter = (length * 2) + (width * 2);
        System.out.println("Rectangle perimeter: " + perimeter);
    }

}