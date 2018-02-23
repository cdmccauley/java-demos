/*
 * CoinPt1.java
 * flip a coin and show result
 */

package coinpt1;

public class CoinPt1 {
    
    /**
     * grab a coin and flip it
     */
    public static void main(String[] args) {
        Coin nickel = new Coin();
        
        nickel.flipCoin();
        if (nickel.showFace() == 0) {
            System.out.println("Heads Up!");
        } else {
            System.out.println("Tails up!");
        }
    }

}