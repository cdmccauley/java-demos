/*
 * RectanglePt1.java
 * class and method demo
 * by christopher mccauley
 */

package rectanglept1;

import java.util.Scanner;

public class RectanglePt1 {
    
    /**
     * tests the Rectangle class
     */
    public static void main(String[] args) {
        double overloadLength = 3.0;
        double overloadWidth = 6.0;
        Rectangle overloadedRectangle = new Rectangle(overloadLength, overloadWidth);
        Rectangle defaultRectangle = new Rectangle();
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Instantiated overloadedRectangle() with the parameters " 
                        + overloadLength + " and " + overloadWidth + "...\n"
                        + "\nMethods for overloadedRectangle:" 
                        + "\ngetLength: " + overloadedRectangle.getLength() 
                        + "\ngetWidth: " + overloadedRectangle.getWidth() 
                        + "\ngetArea: " + overloadedRectangle.getArea() 
                        + "\ngetPerimeter: " + overloadedRectangle.getPerimeter());
        System.out.println("\nMethods for defaultRectangle:" 
                        + "\ngetLength: " + defaultRectangle.getLength() 
                        + "\ngetWidth: " + defaultRectangle.getWidth() 
                        + "\ngetArea: " + defaultRectangle.getArea() 
                        + "\ngetPerimeter: " + defaultRectangle.getPerimeter());
        System.out.print("\ndefaultRectangle.setLength() and defaultRectangle.setWidth() demo: " 
                        + "\nEnter a new length for defaultRectangle: ");
        defaultRectangle.setLength(userInput.nextDouble());
        System.out.print("Enter a new width for defaultRectangle: ");
        defaultRectangle.setWidth(userInput.nextDouble());
        System.out.println("Methods for defaultRectangle:" 
                        + "\ngetLength: " + defaultRectangle.getLength() 
                        + "\ngetWidth: " + defaultRectangle.getWidth() 
                        + "\ngetArea: " + defaultRectangle.getArea() 
                        + "\ngetPerimeter: " + defaultRectangle.getPerimeter());
    }
}