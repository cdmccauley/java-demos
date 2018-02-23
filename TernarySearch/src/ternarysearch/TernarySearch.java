/*
 * TernarySearch.java
 * perform ternary and binary search on array while counting recursions
 * by christopher mccauley
 */

package ternarysearch;

import java.util.Scanner;

public class TernarySearch {
    
    /**
     * fills an array with random numbers
     * pre: none
     * post: array returned
     */
    public static int[] createFilledArray(int numItems) {
        int[] newArray = new int[numItems];
        
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (int)(101 * Math.random());
        }
        System.out.println("\nUnsorted:");
        displayArray(newArray);
        return(newArray);
    }
    
    /**
     * display the values in an array
     * pre: none
     * post: all values are displayed
     */
    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
    
    /**
     * performs merge sort
     * pre: none
     * post: sorting completed
     */
    public static void mergesort(int[] items, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergesort(items, start, mid);
            mergesort(items, mid + 1, end);
            merge(items, start, mid, end);
        }
    }
    
    /**
     * stores values in temp array then overwrites original
     * pre: none
     * post: array has been sorted and overwritten
     */
    public static void merge(int[] items, int start, int mid, int end) {
        int[] temp = new int[items.length];
        int pos1 = start;
        int pos2 = mid + 1;
        int spot = start;
        
        while (!(pos1 > mid && pos2 > end)) {
            if ((pos1 > mid) || ((pos2 <= end) && (items[pos2] < items[pos1]))) {
                temp[spot] = items[pos2];
                pos2 += 1;
            } else {
                temp[spot] = items[pos1];
                pos1 += 1;
            }
            spot += 1;
        }
        for (int i = start; i <= end; i++) {
            items[i] = temp[i];
        }
    }
    
    /**
     * performs binary and ternary searches on array
     * pre: none
     * post: searches have completed
     */
    public static void searchArray(int[] test, int searchNum) {
        int location1, location2;
        int bCounter = 0;
        int tCounter = 0;
        
            location1 = Searches.binarySearch(test, 0, test.length - 1, searchNum, bCounter);
            if (location1 == -1) {
                System.out.println("\nNumber not found during binary search.");
            } else {
                System.out.print(" at position " + location1 + ".\n");
            }
            location2 = Searches.ternarySearch(test, 0, test.length - 1, searchNum, tCounter);
            if (location2 == -1) {
                System.out.println("\nNumber not found during ternary search.");
            } else {
                System.out.print(" at position " + location2 + ".\n");
            }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numItems, searchNum;
        int[] arrayOfInts;
        
        /* generate */
        do {
            System.out.print("Enter number of elements: ");
            numItems = input.nextInt();
        } while (numItems <= 0);
        arrayOfInts = createFilledArray(numItems);
        
        /* sort */
        mergesort(arrayOfInts, 0, arrayOfInts.length -1);
        System.out.println("Sorted:");
        displayArray(arrayOfInts);
        
        /* search */
        System.out.print("Enter a number to search for (-1 to exit): ");
        searchNum = input.nextInt();
        while (searchNum != -1) {
            searchArray(arrayOfInts, searchNum);
            System.out.print("\nEnter a number to search for (-1 to exit): ");
            searchNum = input.nextInt();
        }
    }
}