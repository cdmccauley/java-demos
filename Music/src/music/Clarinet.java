/*
 * Clarinet class
 */
package music;

public class Clarinet extends Woodwind {
    
    /**
     * constructor
     * pre: none
     * post: a clarinet has been created.
     */
    public Clarinet(String clarinetist) {
        super(clarinetist);
    }
    
    /**
     * returns the sound of the instrument.
     * pre: none
     * post: the sound made by the instrument is returned.
     */
    public String makeSound() {
        return("squawk");
    }
    
    /**
     * returns a string that represents the object.
     * pre: none
     * post: a string representing the instrument has been returned.
     */
    public String toString() {
        return(super.getMusician() + " plays " + makeSound() + ".");
    }
}
