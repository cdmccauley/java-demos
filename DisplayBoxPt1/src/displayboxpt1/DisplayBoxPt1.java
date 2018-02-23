/*
 * DisplayBoxPt1.java
 * draw a box
 * by christopher mccauley
 */

package displayboxpt1;
import java.util.Scanner;

public class DisplayBoxPt1 {
    
    /**
     * draw line of *'s
     * pre: passed integer by drawBox()
     * post: i > width
     */
    public static void drawBar(int width) {
        for (int i = 1; i <= width; i++) {
            System.out.print("*");
        }
    }
    
    /**
     * controls how many lines drawBar will draw
     * pre: passed 2 integers by main()
     * post: i > height
     */
    public static void drawBox(int width, int height) {
        for (int i = 1; i <= height; i++) {
            drawBar(width);
        }
    }

    /**
     * prompts for two integers
     */
    public static void main(String[] args) {
        int width, height;
        Scanner userInput = new Scanner(System.in);
        
        do {
        System.out.print("Enter height: ");
        height = userInput.nextInt();
        System.out.print("Enter width: ");
        width = userInput.nextInt();
        } while (height <= 0 || width <= 0);
        drawBox(width, height);
        }
    }