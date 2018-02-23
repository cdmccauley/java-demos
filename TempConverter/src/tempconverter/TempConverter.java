/*
 * TempConverter.java
 * convert fahrenheit to celsius
 * by christopher mccauley
 */

package tempconverter;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * calculates the Celsius equivalent of a temperature given in Fahrenheit
 */
public class TempConverter {

    public static void main(String[] args) {
        double f;
        double c;
        Scanner usersInput = new Scanner(System.in);
        DecimalFormat tempFormat = new DecimalFormat("####.##");
        
        System.out.println("Input temperature in Fahrenheit: ");
        f = usersInput.nextDouble();
        c = ((double)5 / (double)9) * (f - 32);
        System.out.println(tempFormat.format(f) + " degrees Fahrenheit is " + tempFormat.format(c) + " degrees Celsius");
    }

}