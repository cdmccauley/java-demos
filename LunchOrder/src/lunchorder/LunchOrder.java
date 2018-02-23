/*
 * LunchOrder.java
 * take and total an order
 * by christopher mccauley
 */

package lunchorder;

import java.util.Scanner;
import java.text.NumberFormat;

public class LunchOrder {
    
    /**
     * calculates subtotal of order
     * pre: none
     * post: return double
     */
    public static double orderSubTotal(int itemQty, double itemPrice) {
        double subTotal = 0.0;
        subTotal = itemQty * itemPrice;
        
        return(subTotal);
    }
    
    /**
     * take and total order
     * pre: none
     * post: order total displayed
     */
    public static void main(String[] args) {
        Food hamburger = new Food("hamburger", 1.85, 9.0, 33.0, 1.0);
        Food salad = new Food("salad", 2.00, 1.0, 11.0, 5.0);
        Food fries = new Food("fries", 1.30, 11.0, 36.0, 4.0);
        Food soda = new Food("soda", 0.95, 0.0, 38.0, 0.0);
        Scanner userInput = new Scanner(System.in);
        double orderTotal = 0.0;
        final NumberFormat priceFormat = NumberFormat.getCurrencyInstance();
        
        /*System.out.println(hamburger.getName() 
        *        + "\n" + hamburger.getPrice() 
        *        + "\n" + hamburger.getFat() 
        *        + "\n" + hamburger.getCarbs() 
        *        + "\n" + hamburger.getFiber() 
        *        + "\n" + hamburger.toString());
        */
        
        System.out.print("Enter number of hamburgers: ");
        orderTotal += orderSubTotal(userInput.nextInt(), hamburger.getPrice());
        System.out.println("Each hamburger has " + hamburger.nutritionInfo());
        
        System.out.print("Enter number of salads: ");
        orderTotal += orderSubTotal(userInput.nextInt(), salad.getPrice());
        System.out.println("Each salad has " + salad.nutritionInfo());
        
        System.out.print("Enter number of fries: ");
        orderTotal += orderSubTotal(userInput.nextInt(), fries.getPrice());
        System.out.println("French fries have " + fries.nutritionInfo());
        
        System.out.print("Enter number of sodas: ");
        orderTotal += orderSubTotal(userInput.nextInt(), soda.getPrice());
        System.out.println("Each soda has " + soda.nutritionInfo());
        
        System.out.println("Your order total comes to: " + priceFormat.format(orderTotal));
    }

}