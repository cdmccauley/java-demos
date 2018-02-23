/*
 * Performance class
 */
package music;

public class Performance {
    private String arrangement;
    private Instrument solo;
    private Instrument duet_1, duet_2;
    private Instrument trio_1, trio_2, trio_3;
    private Instrument quartet_1, quartet_2, quartet_3, quartet_4;
    
    /**
     * constructor
     * pre: none
     * post: a soloist has been selected.
     */
    public Performance(Instrument s) {
        solo = s;
        arrangement = solo.makeSound();
    }
    
    /**
     * constructor
     * pre: none
     * post: the members of a duet have been selected.
     */
    public Performance(Instrument d1, Instrument d2) {
        duet_1 = d1;
        duet_2 = d2;
        arrangement = duet_1.makeSound() + duet_2.makeSound();
    }
    
    /**
     * constructor
     * pre: none
     * post: the members of a trio have been selected.
     */
    public Performance(Instrument t1, Instrument t2, Instrument t3) {
        trio_1 = t1;
        trio_2 = t2;
        trio_3 = t3;
        arrangement = trio_1.makeSound() + trio_2.makeSound() + trio_3.makeSound();
    }
    
    /**
     * constructor
     * pre: none
     * post: the members of a quartet have been selected.
     */
    public Performance(Instrument q1, Instrument q2, Instrument q3, Instrument q4) {
        quartet_1 = q1;
        quartet_2 = q2;
        quartet_3 = q3;
        quartet_4 = q4;
        arrangement = quartet_1.makeSound() + quartet_2.makeSound() 
                + quartet_3.makeSound() + quartet_4.makeSound();
    }
    
    /**
     * begins the performance.
     * pre: none
     * post: the performance has been played.
     */
    public void begin() {
        System.out.println(arrangement);
    }
    
    /**
     * returns a string that represents the performers.
     * pre: none
     * post: a string representing the performers has been returned.
     */
    public String toString() {
        String program = "The performance includes ";
        program += arrangement;
        return(program);
    }
}
