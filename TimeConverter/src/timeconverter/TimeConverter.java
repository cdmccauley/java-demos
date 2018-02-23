/*
 * TimeConverter.java
 * convert time values selected and input by user
 * by christopher mccauley
 */

package timeconverter;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TimeConverter {
    /**
     * prompts for input with customized message
     * pre: Scanner and 2 Strings passed by main()
     * post: double returned to main()
     */
    public static double getValue(Scanner userInput, String inputType, String resultType) {
        double initialValue;
        
        System.out.println("Convert " + inputType + " to " + resultType + ".");
        do {
            System.out.print("Enter " + inputType + ": ");
            initialValue = userInput.nextDouble();
        } while (initialValue <= 0.0);
        return(initialValue);
    }
    
    /**
     * prompts user for conversion type and performs conversion
     */
    public static void main(String[] args) {
        byte conversionType;
        String inputType = new String();
        String resultType = new String();
        double initialValue = 0.0;
        double convertedValue = 0.0;
        Scanner userInput = new Scanner(System.in);
        DecimalFormat resultFormat = new DecimalFormat("#.##"); 

        System.out.print("Enter 0 to convert hours to minutes."
                + "\nEnter 1 to convert days to hours."
                + "\nEnter 2 to convert minutes to hours."
                + "\nEnter 3 to convert hours to days.\n");
        do {
            System.out.print("Selection: ");
            conversionType = userInput.nextByte();
        } while (conversionType < 0 || conversionType > 3);
        switch (conversionType) {
            case 0:
                inputType = "Hours";
                resultType = "Minutes";
                initialValue = getValue(userInput, inputType, resultType);
                convertedValue = initialValue * 60.0;
                break;
            case 1:
                inputType = "Days";
                resultType = "Hours";
                initialValue = getValue(userInput, inputType, resultType);
                convertedValue = initialValue * 24.0;
                break;
            case 2:
                inputType = "Minutes";
                resultType = "Hours";
                initialValue = getValue(userInput, inputType, resultType);
                convertedValue = initialValue / 60.0;
                break;
            case 3:
                inputType = "Hours";
                resultType = "Days";
                initialValue = getValue(userInput, inputType, resultType);
                convertedValue = initialValue / 24.0;
                break;
        }
        System.out.println(resultFormat.format(initialValue) + " " + inputType + " converts to " 
                + resultFormat.format(convertedValue) + " " + resultType);
    }
}