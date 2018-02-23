/*
 * CoinPt2.java
 * flip a coin and show result
 */

package coinpt2;

public class CoinPt2 {
    
    /**
     * grab a coin and flip it
     */
    public static void main(String[] args) {
        Coin nickel = new Coin();
        
        nickel.flipCoin();
        System.out.println(nickel.toString());
    }

}