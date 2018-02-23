/*
 * Coin class
 * by christopher mccauley
 */
package coinpt2;

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
     * toString() override
     * post: returns String
     */
    public String toString() {
        String coinString;
        
        if (faceUp == 1) {
            coinString = "The coin is face up.";
        } else {
            coinString = "The coin is face down.";
        }
        return coinString;
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
