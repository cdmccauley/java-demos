/*
 * Evens.java
 * for loop demonstration
 * by christopher mccauley
 */

package evens;

/**
 * prints even numbers between 1 and 20 (inclusive)
 */
public class Evens {

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}