/*
 * Instrument class
 */
package music;

abstract class Instrument {
    String musician;
    
    /**
     * constructor
     * pre: none
     * post: a musician has been assigned to the instrument.
     */
    public Instrument(String name) {
        musician = name;
    }
    
    /**
     * returns the name of the musician.
     * pre: none
     * post: the name of the musician playing the instrument has been returned.
     */
    public String getMusician() {
        return(musician);
    }
    
    /**
     * should return the sound of the instrument.
     * pre: none
     * post: the sound made by the instrument is returned
     */
    abstract String makeSound();
}
