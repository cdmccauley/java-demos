/*
 * FindName.java
 * create a list of names and search it to return which list item it is
 * by christopher mccauley
 */

package findname;

import java.util.Scanner;
import java.lang.Math;

public class FindName {

    public static void main(String[] args) {
//        final int MAX = 20;
//        int[] numArray = new int[MAX];
//        Scanner input = new Scanner(System.in);
//        int num, location;
//        
//        /* fill array with random numbers */
//        for (int i = 0; i < numArray.length; i++) {
//            numArray[i] = (int)((MAX + 1) * Math.random());
//        }
//        
//        /* prompt user for a number to search for */
//        System.out.print("Enter a number between 0 and " + MAX + ": ");
//        num = input.nextInt();
//        
//        /* Search for number and notify user of num location */
//        location = Search.linear(numArray, num);
//        if (location == -1) {
//            System.out.println("Sorry, number not found in array.");
//        } else {
//            System.out.println("First occurrence is element " + location);
//        }
        
        int listSize;
        String[] nameArray;
        String name;
        int position;
        Scanner input = new Scanner(System.in);
        
        System.out.print("How long will your list of names be? ");
        listSize = input.nextInt();
        nameArray = new String[listSize];
        
        for (int i = 0; i <= nameArray.length - 1; i++) {
            System.out.print("Enter a name to add to the list: ");
            nameArray[i] = input.next();
        }
        
        System.out.print("Enter a name to search for: ");
        name = input.next();
        
        position = Search.linear(nameArray, name);
        if (position == -1) {
            System.out.println("Sorry, name not found.");
        } else {
            System.out.println("First occurrence of " + name + " is element " + position);
        }
        
    }
}