/*
 * Rectangle class
 * written by chris mccauley
 */

package rectanglept1;

/**
 * Rectangle class
 */
public class Rectangle {
    private double length, width;
    
    /**
     * constructor
     */
    public Rectangle() {
        length = 2.0;
        width = 1.0;
    }
    
    /**
     * constructor
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    /**
     * gets the length of a rectangle
     * post: returns double
     */
    public double getLength() {
        return length;
    }
    
    /**
     * gets the width of a rectangle
     * post: returns double
     */
    public double getWidth() {
        return width;
    }
    
    /**
     * calculates area of a rectangle
     * post: returns result as double
     */
    public double getArea() {
        return (length * width);
    }
    
    /**
     * calculates perimeter of a rectangle
     * post: returns result as double
     */
    public double getPerimeter() {
        return ((length * 2.0) + (width * 2.0));
    }
    
    /**
     * sets new length for a rectangle
     * post: length changed
     */
    public void setLength(double newLength) {
        length = newLength;
    }
    
    /**
     * sets new width for a rectangle
     * post: width changed
     */
    public void setWidth(double newWidth) {
        width = newWidth;
    }
}
