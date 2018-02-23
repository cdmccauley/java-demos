/*
 * Food class
 */
package lunchorder;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Food {
    private final DecimalFormat gramFormat = new DecimalFormat("0.0");
    private final NumberFormat priceFormat = NumberFormat.getCurrencyInstance();
    double price, fat, carbs, fiber;
    String name, foodString, fatCarbsFiber;
    
    /**
     * constructor method
     * pre: none
     * post: initializes variables for new object
     */
    public Food(String name, double price, double fat, double carbs, double fiber) {
        this.name = name;
        this.price = price;
        this.fat = fat;
        this.carbs = carbs;
        this.fiber = fiber;
        foodString = new String();
        fatCarbsFiber = new String();
    }
    
    /**
     * overridden toString()
     * pre: none
     * post: a string representing the object has been returned
     */
    public String toString() {
        foodString = name 
                + "\n" + "price: " + priceFormat.format(price) 
                + "\n" + "fat(g): " + gramFormat.format(fat)
                + "\n" + "carbohydrates(g): " + gramFormat.format(carbs)
                + "\n" + "fiber(g): " + gramFormat.format(fiber);
        
        return foodString;
    }
    
    /**
     * the name of the food
     * pre: none
     * post: returns string
     */
    public String getName() {
        return name;
    }
    
    /**
     * the price of the food
     * pre: none
     * post: returns double
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * the grams of fat in the food
     * pre: none
     * post: returns double
     */
    public double getFat() {
        return fat;
    }
    
    /**
     * the grams of carbohydrates in the food
     * pre: none
     * post: returns double
     */
    public double getCarbs() {
        return carbs;
    }
    
    /**
     * the grams of fiber in the food
     * pre: none
     * post: returns double
     */
    public double getFiber() {
        return fiber;
    }
    
    public String nutritionInfo() {
        fatCarbsFiber = fat + "g of fat, " + carbs + "g of carbs, and " + fiber + "g of fiber.\n";
        
        return fatCarbsFiber;
    }
}
