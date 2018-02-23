/*
 * Hurricane.java
 * display wind speeds for the Saffir-Simpson Hurricane Scale categories
 * by christopher mccauley
 */

package hurricane;

import java.util.Scanner;

/**
 * return appropriate message for input
 */
public class Hurricane {

    public static void main(String[] args) {
        int hurricaneCategory;
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter hurricane category to display wind speed range.\nCategory: ");
        hurricaneCategory = userInput.nextInt();
        switch (hurricaneCategory) {
            case 1:
                System.out.println("Category 1 wind speeds range from 74-95 mph, 64-82 kt, or 119-153 km/hr.");
                break;
            case 2:
                System.out.println("Category 2 wind speeds range from 96-110 mph, 83-95 kt, or 154-177 km/hr.");
                break;
            case 3:
                System.out.println("Category 3 wind speeds range from 111-130 mph, 96-113 kt, or 178-209 km/hr.");
                break;
            case 4:
                System.out.println("Category 4 wind speeds range from 131-155 mph, 114-135 kt, or 210-249 km/hr.");
                break;
            case 5:
                System.out.println("Category 5 wind speeds can be more than 155 mph, 135 kt, or 249 km/hr.");
        }
    }

}