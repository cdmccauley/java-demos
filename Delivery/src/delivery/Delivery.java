/*
 * Delivery.java
 * determines whether to accept or reject a package based on dimensions
 * by christopher mccauley
 */

package delivery;

import java.util.Scanner;

/**
 * analyze input to determine output message
 */
public class Delivery {

    public static void main(String[] args) {
        int pkgLength, pkgWidth, pkgHeight;
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter package length: ");
        pkgLength = userInput.nextInt();
        System.out.print("Enter package width: ");
        pkgWidth = userInput.nextInt();
        System.out.print("Enter package height: ");
        pkgHeight = userInput.nextInt();
        
        if (pkgLength > 10 || pkgWidth > 10 || pkgHeight > 10) {
            System.out.println("Reject");
        } else {
            System.out.println("Accept");
        }
    }

}