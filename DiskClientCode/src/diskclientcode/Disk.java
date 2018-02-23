/*
 * Disk class
 */
package diskclientcode;

public class Disk implements Comparable {
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
     * observe the volume of disk
     * pre: none
     * post: returns double
     */
    public double getVolume() {
        double volume;
        volume = 3.14159 * (radius * radius) * thickness;
        
        return(volume);
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
    
    /**
     * compareTo override
     * pre: none
     * post: returns integer
     */
    public int compareTo(Object x) {
        Disk testDisk = (Disk)x;
        
        if (getVolume() > testDisk.getVolume()) {
            return(-1);
        }
        else if (getVolume() == testDisk.getVolume()) {
            return(0);
        } else {
            return(1);
        }
    }
}
