/*
 * Woodwind class
 */
package music;

abstract class Woodwind extends Instrument {
    
    /**
     * constructor
     * pre: none
     * post: a woodwind instrument has been created.
     */
    public Woodwind(String player) {
        super(player);
    }
    
    /**
     * returns the sound of the instrument.
     * pre: none
     * post: the sound made by the instrument is returned
     */
    public String makeSound() {
        return("toot");
    }
}
