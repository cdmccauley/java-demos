/*
 * Reverse.java
 * countdown!
 * by christopher mccauley
 */

package reverse;

public class Reverse {

    public static void main(String[] args) {
        int[] theCount = new int[10];
        
        for (int i = 0; i < theCount.length; i++) {
            theCount[i] = i;
        }
        System.out.println("Countdown");
        for (int j = theCount.length - 1; j >= 0; j--) {
            System.out.println(theCount[j]);
        }
    }
}