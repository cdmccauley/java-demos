/*
 * MetricConversion.java
 * converts some metric and imperial values
 * by christopher mccauley
 */

package metricconversion;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MetricConversion {
    
    /**
     * converts kilometers to miles
     * post: passes double to main()
     */
    public static double kilometersToMiles(double initialValue, double convertedValue) {
        //convertedValue = initialValue / 1.60; // less precision
        convertedValue = initialValue / 1.609344; // more precision
        return(convertedValue);
    }
    
    /**
     * converts meters to yards
     * post: passes double to main()
     */
    public static double metersToYards(double initialValue, double convertedValue) {
        //convertedValue = initialValue / 0.91; // less precision
        convertedValue = initialValue / 0.9144; // more precision
        return(convertedValue);
    }
    
    /**
     * converts centimeters to feet
     * post: passes double to main()
     */
    public static double centimetersToFeet(double initialValue, double convertedValue) {
        //convertedValue = initialValue / 30.0; // less precision
        convertedValue = initialValue / 30.48; // more precision
        return(convertedValue);
    }
    
    /**
     * converts centimeters to inches
     * post: passes double to main()
     */
    public static double centimetersToInches(double initialValue, double convertedValue) {
        convertedValue = initialValue / 2.54;
        return(convertedValue);
    }
    
    /**
     * converts miles to kilometers
     * post: passes double to main()
     */
    public static double milesToKilometers(double initialValue, double convertedValue) {
        //convertedValue = initialValue * 1.60; // less precision
        convertedValue = initialValue * 1.609344; // more precision
        return(convertedValue);
    }
    
    /**
     * converts yards to meters
     * post: passes double to main()
     */
    public static double yardsToMeters(double initialValue, double convertedValue) {
        //convertedValue = initialValue * 0.91; // less precision
        convertedValue = initialValue * 0.9144; // more precision
        return(convertedValue);
    }
    
    /**
     * converts feet to centimeters
     * post: passes double to main()
     */
    public static double feetToCentimeters(double initialValue, double convertedValue) {
        //convertedValue = initialValue * 30.0; // less precision
        convertedValue = initialValue * 30.48; // more precision
        return(convertedValue);
    }
    
    /**
     * converts inches to centimeters
     * post: passes double to main()
     */
    public static double inchesToCentimeters(double initialValue, double convertedValue) {
        convertedValue = initialValue * 2.54;
        return(convertedValue);
    }
    
    public static void main(String[] args) {
        double initialValue;
        byte menuSelection;
        double convertedValue = 0.0;
        boolean convert = true;
        String firstType = new String();
        String secondType = new String();
        String convertAgain = new String();
        Scanner userInput = new Scanner(System.in);
        DecimalFormat resultFormat = new DecimalFormat("#.###");
        
        do {
            System.out.print("Enter a number: ");
            initialValue = userInput.nextDouble();
            do {
                System.out.print("Convert:"
                    + "\n1. Inches to Centimeters\t5. Centimeters to Inches" 
                    + "\n2. Feet to Centimeters\t\t6. Centimeters to Feet"
                    + "\n3. Yards to Meters\t\t7. Meters to Yards"
                    + "\n4. Miles to Kilometers\t\t8. Kilometers to Miles"
                    + "\nEnter your choice: ");
                menuSelection = userInput.nextByte();
            } while (menuSelection < 1 || menuSelection > 8);
            switch (menuSelection) {
                case 1:
                    convertedValue = inchesToCentimeters(initialValue, convertedValue);
                    firstType = "Inches";
                    secondType = "Centimeters";
                    break;
                case 2:
                    convertedValue = feetToCentimeters(initialValue, convertedValue);
                    firstType = "Feet";
                    secondType = "Centimeters";
                    break;
                case 3:
                    convertedValue = yardsToMeters(initialValue, convertedValue);
                    firstType = "Yards";
                    secondType = "Meters";
                    break;
                case 4:
                    convertedValue = milesToKilometers(initialValue, convertedValue);
                    firstType = "Miles";
                    secondType = "Kilometers";
                    break;
                case 5:
                    convertedValue = centimetersToInches(initialValue, convertedValue);
                    firstType = "Centimeters";
                    secondType = "Inches";
                    break;
                case 6:
                    convertedValue = centimetersToFeet(initialValue, convertedValue);
                    firstType = "Centimeters";
                    secondType = "Feet";
                    break;
                case 7:
                    convertedValue = metersToYards(initialValue, convertedValue);
                    firstType = "Meters";
                    secondType = "Yards";
                    break;
                case 8:
                    convertedValue = kilometersToMiles(initialValue, convertedValue);
                    firstType = "Kilometers";
                    secondType = "Miles";
                    break;
            }
            System.out.println(resultFormat.format(initialValue) + " " + firstType + " equals " 
                + resultFormat.format(convertedValue) + " " + secondType + ".");
            System.out.print("Type 'y' to perform another conversion: ");
            convertAgain = userInput.next();
            if (!(convertAgain.compareTo("y") == 0)) {
                convert = false;
            }
        } while (convert);
    }
}