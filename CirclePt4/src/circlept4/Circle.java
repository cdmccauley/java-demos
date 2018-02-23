/*
 * Circle class
 */
package circlept4;

/**
 * Circle class 
 */
public class Circle {
    private static final double PI = 3.14;
    private double radius;
    
    /**
     * constructor
     * pre: none
     * post: A Circle object created. Radius initialized to 1.
     */
    public Circle() {
        radius = 1;
    }
    
    /**
     * constructor
     * pre: none
     * post: A Circle object created. Radius initialized to 1.
     */
    public Circle(double r) {
        radius = r;
    }
    
    /**
     * equals() override
     * post: returns boolean 
     */
    public boolean equals(Object c) {
        Circle testObj = (Circle)c;
        
        if (testObj.getRadius() == radius) {
            return(true);
        } else {
            return(false);
        }
    }
    
    /**
     * toString() override
     * post: returns String
     */
    public String toString() {
        String circleString;
        
        circleString = "Circle has radius " + radius;
        return(circleString);
    }
    
    /**
     * Changes the radius of the circle.
     * pre: none
     * post: Radius has been changed.
     */
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
    
    /**
     * Calculates the area of the circle.
     * pre: none
     * post: The area of the circle has been returned.
     */
    public double area() {
        double circleArea;
        
        circleArea = PI * radius * radius;
        return(circleArea);
    }
    
    /**
     * Returns the radius of the circle.
     * pre: none
     * post: The radius of the circle has been returned.
     */
    public double getRadius() {
        return(radius);
    }
    
    /**
     * Calculates the circumference of the circle.
     * pre: none
     * post: The circumference of the circle has been returned.
     */
    public double circumference() {
        double circleCircumference;
        
        circleCircumference = 2 * PI * radius;
        return circleCircumference;
    }
    
    /**
     * displays the formula for the area of a circle
     * post: prints message
     */
    public void displayAreaFormula() {
        System.out.println("The formula for the area of a circle is a=Pi*r*r");
    }
}
