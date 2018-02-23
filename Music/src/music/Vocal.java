/*
 * Vocal class
 */
package music;

public class Vocal extends Instrument {
    
    /**
     * constructor
     * pre: none
     * post: a singer has been created.
     */
    public Vocal(String singerName) {
        super(singerName);
    }
    
    /**
     * returns the sound of the instrument.
     * pre: none
     * post: the sound made by the singer.
     */
    public String makeSound() {
        return("LaLaLa");
    }
    
    /**
     * returns a string that represents the instrument
     * pre: none
     * post: a string representing the singer.
     */
    public String toString() {
        return(super.getMusician() + " sings " + makeSound() + ".");
    }
}
