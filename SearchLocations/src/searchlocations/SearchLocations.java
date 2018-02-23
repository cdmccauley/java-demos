/*
 * SearchLocations.java
 * binary search demo with merge sort
 * by christopher mccauley
 */

package searchlocations;

import java.util.Scanner;
import java.lang.Math;

public class SearchLocations {
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
     * create, sort, and search array
     * pre: none
     * post: returns index of searchNum
     */
    public static void sortIntArray() {
        final int LIST_SIZE = 40;
        Scanner input = new Scanner(System.in);
        int numItems, searchNum, location;
        int[] test;
        
        /* fill array */
        numItems = LIST_SIZE;
        test = new int[numItems];
        for (int i = 0; i < test.length; i++) {
            test[i] = (int)(100 * Math.random());
        }
        
        /* sort array */
        mergesort(test, 0, test.length -1);
        displayArray(test);
        
        /* search array */
        System.out.print("Enter a number to search for (-1 to exit): ");
        searchNum = input.nextInt();
        while (searchNum != -1) {
            location = binarySearch(test, 0, test.length - 1, searchNum);
            if (location == -1) {
                System.out.println("\nNumber not found.");
            } else {
                System.out.println("\nNumber at position: " + location);
            }
            System.out.print("\nEnter a number to search for (-1 to exit): ");
            searchNum = input.nextInt();
        }
    }
    
    /**
     * perform binary search on an array
     * pre: none
     * post: returns index of int or -1 to indicate not found
     */
    public static int binarySearch(int[] items, int start, int end, int goal) {
        if (start > end) {
            return(-1);
        } else {
            int mid = (start + end) / 2;
            System.out.println("Examining " + mid);
            if (goal == items[mid]) {
                return(mid);
            } else if (goal < items[mid]) {
                return(binarySearch(items, start, mid -1, goal));
            } else {
                return(binarySearch(items, mid + 1, end, goal));
            }
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
    
    public static void main(String[] args) {
        sortIntArray();
    }
}