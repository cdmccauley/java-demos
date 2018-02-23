/*
 * PizzaCost.java
 * display cost of making a pizza
 * by christopher mccauley
 */

package pizzacost;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 * calculates cost of pizza based on diameter, ingredients, labor, and overhead
 */
public class PizzaCost {

    public static void main(String[] args) {
        final double LABOR_RATE = 0.75;
        final double RENT_RATE = 1.00;
        final double INGREDIENT_RATE = 0.05;
        int pizzaDiameter;
        double pizzaCost;
        Scanner userInput = new Scanner(System.in);
        NumberFormat totalFormat = NumberFormat.getCurrencyInstance();
        
        System.out.println("Enter the diameter of the pizza in inches: ");
        pizzaDiameter = userInput.nextInt();
        pizzaCost = LABOR_RATE + RENT_RATE + (INGREDIENT_RATE * pizzaDiameter * pizzaDiameter);
        System.out.println("The cost of making the pizza is: " + totalFormat.format(pizzaCost));
        
    }

}