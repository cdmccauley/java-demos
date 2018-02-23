/*
 * adderDealer class
 */
package adder;

import java.util.Scanner;

public class adderDealer {
    int operand1, operand2, result, playerScore;
    String promptString;
    Scanner userInput;
    
    /**
     * constructor method
     * pre: none
     * post: initializes variables
     */
    public adderDealer() {
        operand1 = 0;
        operand2 = 0;
        result = 0;
        playerScore = 0;
        promptString = new String();
        userInput = new Scanner(System.in);
    }
    
    /**
     * dealer generates two numbers and records their result
     * pre: none
     * post: stores String in promptString
     */
    public void prepareRound() {
        operand1 = generateNumber();
        operand2 = generateNumber();
        result = operand1 + operand2;
        promptString = operand1 + " + " + operand2 + " = ";
    }
    
    /**
     * dealer thinks of a number between 0 and 20
     * pre: none
     * post: returns integer
     */
    public int generateNumber() {
        return((int)(21 * Math.random()));   
    }
    
    /**
     * dealer begins a round of adder
     * pre: none
     * post: checkAnswer() returns control
     */
    public void playRound() {
        prepareRound();
        System.out.print(promptString);
        checkAnswer();
    }
    
    /**
     * dealer prompts for and checks answers until player is done
     * pre: none
     * post: displays score
     */
    public void checkAnswer() {
        boolean playAgain = true;
        boolean incorrect = true;
        int attemptsLeft = 3;
        int answer = 0;
        int possiblePoints = 5;
        
        while (incorrect && attemptsLeft > 0 && !(answer == 999)) {
            attemptsLeft -= 1;
            answer = userInput.nextInt();
            if (answer == 999) {
                playAgain = false;
            } else if (answer == result) {
                playerScore += possiblePoints;
                incorrect = false;
            } else if (!(answer == result) && attemptsLeft > 0) {
                possiblePoints -= 2;
                System.out.print("Wrong answer. Enter another answer: ");
            } else {
                System.out.println(promptString + "" + result);
            }
        }
        if (playAgain) {
            playRound();
        } else {
            System.out.println("Your score is: " + playerScore);
        }
    }
}
