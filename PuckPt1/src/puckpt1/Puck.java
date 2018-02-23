/*
 * Puck class, subclass of Disk class
 */
package puckpt1;

public class Puck extends Disk {
    private static final double PUCK_RADIUS = 1.5;
    private static final double PUCK_THICKNESS = 1.0;
    private double weight;
    private boolean standard, youth;
    
    /**
     * constructor
     * pre: none
     * post: initializes variables
     */
    public Puck(double weight) {
        super.setRadius(PUCK_RADIUS);
        super.setThickness(PUCK_THICKNESS);
        this.weight = weight;
        standard = false;
        youth = false;
        
        if (weight >= 5.0 && weight <= 5.5) {
            standard = true;
        } else if (weight >= 4.0 && weight <= 4.5) {
            youth = true;
        }
    }
    
    /**
     * observe the weight of the puck
     * pre: none
     * post: returns double
     */
    public double getWeight() {
        return(weight);
    }
    
    /**
     * check compliance with division standards
     * pre: none
     * post: returns string
     */
    public String getDivision() {
        String divisionString = new String();
        
        if (standard) {
            divisionString = "This puck complies with the standard division standards.";
        } else if (youth) {
            divisionString = "This puck complies with the youth division standards.";
        } else {
            divisionString = "This puck does not conform with any division standard.";
        }
        return(divisionString);
    }
    
    /**
     * equals override
     * pre: none
     * post: returns boolean
     */
    public boolean equals(Object x) {
        Puck y = (Puck)x;
        boolean isEqual = false;
        
        if (y.getRadius() == 1.5 && y.getThickness() == 1.0 && y.getWeight() == weight) {
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
        String puckString = new String();
        
        puckString = "The puck has radius " + super.getRadius() 
                + ", thickness " + super.getThickness() 
                + ", and weight " + weight + ".";
        return(puckString);
    }
}
