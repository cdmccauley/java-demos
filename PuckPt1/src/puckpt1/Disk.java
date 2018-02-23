/*
 * Disk class
 */
package puckpt1;

public class Disk {
    private double radius, thickness;
    
    /**
     * constructor
     * pre: none
     * post: initializes variables
     */
    public Disk() {
        radius = 0.0;
        thickness = 0.0;
    }
    
    /**
     * overloaded constructor
     * pre: none
     * post: initializes variables
     */
    public Disk(double radius, double thickness) {
        this.radius = radius;
        this.thickness = thickness;
    }
    
    /**
     * sets the radius of the disk
     * pre: none
     * post: radius gets double
     */
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
    
    /**
     * sets the thickness of the disk
     * pre: none
     * post: thickness gets double
     */
    public void setThickness(double newThickness) {
        thickness = newThickness;
    }
    
    /**
     * observe the disk radius
     * pre: none
     * post: returns double
     */
    public double getRadius() {
        return(radius);
    }
    
    /**
     * observe the disk thickness
     * pre: none
     * post: returns double
     */
    public double getThickness() {
        return(thickness);
    }
    
    /**
     * equals override
     * pre: none
     * post: returns boolean
     */
    public boolean equals(Object x) {
        Disk y = (Disk)x;
        boolean isEqual = false;
        
        if (y.getRadius() == radius && y.getThickness() == thickness) {
            isEqual = true;
        }
        return(isEqual);
    }
    
    /**
     * toString override
     * pre: none
     * post: returns string
     */
    public String toString() {
        String diskString = new String();
        
        diskString = "The disk has radius " + radius 
                + " and thickness " + thickness + ".";
        return(diskString);
    }
}
