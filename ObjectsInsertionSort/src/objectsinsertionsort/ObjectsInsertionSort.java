/*
 * ObjectsInsertionSort.java
 * insertion sort demo using the Object superclass in a method
 * by christopher mccauley
 */

package objectsinsertionsort;

import java.lang.Math;

public class ObjectsInsertionSort {
    /**
     * object insertion sort
     * pre: none
     * post: array of objects has been sorted
     */
    public static void objInsertSort(Object[] compareObj) {
        Object swapContainer = new Object();
        int previousIndex;
        
        for (int k = 1; k < compareObj.length; k++) {
            swapContainer = (String)compareObj[k];
            previousIndex = k - 1;
            while ((compareObj[previousIndex].toString().compareTo(swapContainer.toString()) > 0) 
                    && (previousIndex > 0)) {
                compareObj[previousIndex + 1] = compareObj[previousIndex];
                previousIndex -= 1;
            }
            if (compareObj[previousIndex].toString().compareTo(swapContainer.toString()) > 0) {
                compareObj[previousIndex + 1] = compareObj[previousIndex];
                compareObj[previousIndex] = swapContainer;
            } else {
                compareObj[previousIndex + 1] = swapContainer;
            }
        }
    }

    public static void main(String[] args) {
        final int STRING_LENGTH = 5;
        String[] stringList = new String[10];
        int toChar;
        char toString;
        
        /* fill and display array with random strings */
        System.out.println("Unsorted:");
        for (int i = 0; i < 10; i++) {
            stringList[i] = new String();
            for (int j = 0; j < STRING_LENGTH; j++) {
                toChar = (int)(26 * Math.random() + 97); // unicode lowercase range
                toString = (char)toChar;
                stringList[i] += toString;
            }
            System.out.println(stringList[i]);
        }
        
        /* call insertion sort method */
        objInsertSort(stringList);
        
        /* show sorted array */
        System.out.println("\nSorted:");
        for (int l = 0; l < stringList.length; l++) {
            System.out.println(stringList[l]);
        }
    }
}