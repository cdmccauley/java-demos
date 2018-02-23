/*
 * Piccolo class
 */
package music;

public class Piccolo extends Woodwind {
    
    /**
     * constructor
     * pre: none
     * post: a piccolo has been created.
     */
    public Piccolo(String piccoloist) {
        super(piccoloist);
    }
    
    /**
     * returns the sound of the instrument.
     * pre: none
     * post: the sound made by the instrument is returned.
     */
    public String makeSound() {
        return("peep");
    }
    
    /**
     * returns a string that represents the instrument
     * pre: none
     * post: a string representing the instrument has been returned.
     */
    public String toString() {
        return(super.getMusician() + " plays " + makeSound() + ".");
    }
}
