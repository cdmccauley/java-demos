/*
 * Nim.java
 * a game of nim
 * by christopher mccauley
 */

package nim;

import java.util.Scanner;

public class Nim {
    
    /**
     * ensures the computer isn't attempting to take stones that don't exist
     * post: returns boolean to nimOpponent()
     */
    public static boolean nimOpponentRules(int opponentStones, int stonePile, boolean rulesViolation) {
        if (opponentStones > stonePile) {
            rulesViolation = true;
        } else {
            rulesViolation = false;
        }
        return rulesViolation;
    }
    
    /**
     * decides how many stones the computer will take
     * note: winner forces opponent to take turns on 5, 9, 13, 17, 21, 25, 29, 33
     * post: returns integer to nimOpponent()
     */
    public static int drawStones(int opponentStones, int stonePile) {
        if (stonePile % 4 == 0) {
            opponentStones = 3;
        } else if ((stonePile + 1) % 4 == 0) {
            opponentStones = 2;
        } else if ((stonePile + 2) % 4 == 0) {
            opponentStones = 1;
        } else {
            opponentStones = (int)(3 * Math.random() + 1);
        }
        return opponentStones;
    }
    
    /**
     * the computer's turn to play
     * post: returns an int to main()
     */
    public static int nimOpponent(int stonePile) {
        int opponentStones = 0;
        boolean rulesViolation = false;
        
        do {
            opponentStones = drawStones(opponentStones, stonePile);
            rulesViolation = nimOpponentRules(opponentStones, stonePile, rulesViolation);
        } while (rulesViolation);
        System.out.println("There are " + stonePile + " stones. The computer takes " + opponentStones + ".");
        stonePile = stonePile - opponentStones;
        
        return stonePile;
    }
    
    /**
     * checks to see if the game is over
     * post: returns boolean to main()
     */
    public static boolean nimLoss(int stonePile) {
        boolean gameOver = false;
        
        if (stonePile <= 0) {
            gameOver = true;
        }
        return gameOver;
    }
    
    /**
     * validates players input
     * post: returns boolean to nimPlayer()
     */
    public static boolean isValidEntry(int playerStones, int stonePile, boolean rulesViolation) {
        
        if (playerStones < 1 || playerStones > 3) {
            rulesViolation = true;
            System.out.println("You may only take 1, 2, or 3 stones.");
        } else if (playerStones > stonePile) {
            rulesViolation = true;
            System.out.println("There are fewer stones than that.");
        } else {
            rulesViolation = false;
        }
        return rulesViolation;
    }
    
    /**
     * the player
     * post: returns an int to main()
     */
    public static int nimPlayer(int stonePile) {
        boolean rulesViolation = false;
        int playerStones;
        Scanner playerInput = new Scanner(System.in);
        
        do {
            System.out.print("There are " + stonePile + " stones. How many would you like to take?: ");
            playerStones = playerInput.nextInt();
            rulesViolation = isValidEntry(playerStones, stonePile, rulesViolation);
        } while (rulesViolation);
        stonePile = stonePile - playerStones;
        return stonePile;
    }
    
    /**
     * creates the pile of stones players will take from
     * post: returns an int to main()
     */
    public static int makeStonePile(int stonePile) {
        stonePile = (int)(16 * Math.random() + 15);
        return stonePile;
    }
    
    public static void main(String[] args) {
        int stonePile = 0;
        boolean nimOpponentWin = false;
        boolean nimPlayerWin = false;
        
        stonePile = makeStonePile(stonePile);
        
        do {
            if (!(nimPlayerWin)) {
                stonePile = nimPlayer(stonePile);
                nimOpponentWin = nimLoss(stonePile);
            } 
            if (!(nimOpponentWin)) {
                stonePile = nimOpponent(stonePile);
                nimPlayerWin = nimLoss(stonePile);
            } else if (nimOpponentWin) {
                System.out.println("The computer beats the player!");
            }
            if (nimPlayerWin) {
                System.out.println("The player beats the computer!");
            }
        } while (stonePile > 0);
    }
}