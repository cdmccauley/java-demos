/*
 * DisplayBoxPt2.java
 * draw a box
 * by christopher mccauley
 */

package displayboxpt2;
import java.util.Scanner;

public class DisplayBoxPt2 {
    
    /**
     * draws a line of characters
     * pre: passed an integer and string by overloaded drawBox()
     * post: i <= width
     */
    public static void drawBar(int width, String customChar) {
        for (int i = 1; i <= width; i++) {
            System.out.print(customChar);
        }
        System.out.println();
    }
    
    /**
     * draws a line of *'s
     * pre: passed integer by drawBox()
     * post: i > width
     */
    public static void drawBar(int width) {
        for (int i = 1; i <= width; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    
    /**
     * controls how many lines drawBar() will draw
     * pre: passed two integers and a String by main()
     * post: i > height
     */
    public static void drawBox(int width, int height, String customChar) {
        for (int i = 1; i <= height; i++) {
            drawBar(width, customChar);
        }
    }
    
    /**
     * controls how many lines drawBar() will draw
     * pre: passed 2 integers by main()
     * post: i > height
     */
    public static void drawBox(int width, int height) {
        for (int i = 1; i <= height; i++) {
            drawBar(width);
        }
    }

    /**
     * prompts user for inputs
     */
    public static void main(String[] args) {
        int width, height;
        String useCustom = new String();
        String customChar = new String();
        Scanner userInput = new Scanner(System.in);
        
        do {
        System.out.print("Enter height: ");
        height = userInput.nextInt();
        System.out.print("Enter width: ");
        width = userInput.nextInt();
        } while (height <= 0 || width <= 0);
        System.out.print("Do you want to enter a character to use to display the box? (enter y for yes): ");
        useCustom = userInput.next();
        if (useCustom.compareTo("y") == 0) {
            System.out.print("Which character would you like to use?: ");
            customChar = userInput.next();
            drawBox(width, height, customChar);
        } else {
        drawBox(width, height);
        }
    }
}