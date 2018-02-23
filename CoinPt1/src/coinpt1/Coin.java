/*
 * Coin class
 * by christopher mccauley
 */
package coinpt1;

/**
 * Coin class
 */
public class Coin {
    private int faceUp;
    
    /**
     * constructor
     */
    public Coin() {
        faceUp = (int)(Math.random() + 0.5);
    }
    
    /**
     * flips the coin
     * post: changed faceUp
     */
    public void flipCoin() {
        faceUp = (int)(Math.random() + 0.5);
    }
    
    /**
     * shows the coin
     * post: return int
     */
    public int showFace() {
        return faceUp;
    }
}
