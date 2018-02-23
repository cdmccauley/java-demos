/*
 * Adder.java
 * play a game of adder with bob the adder dealer
 * by christopher mccauley
 */

package adder;

public class Adder {
    
    /**
     * summons then commands bob to begin a round of adder
     * pre: none
     * post: adderDealer() displays a score
     */
    public static void main(String[] args) {
        adderDealer bob = new adderDealer();
        
        bob.playRound();
    }

}