/*
 * ArrayListSort.java
 * selection sort demo using an arraylist
 * by christopher mccauley
 */

package arraylistsort;

import java.util.ArrayList;
import java.lang.Math;
import java.text.DecimalFormat;

public class ArrayListSort {

    public static void main(String[] args) {
        ArrayList<Double> doublesList = new ArrayList<Double>();
        DecimalFormat roundForm = new DecimalFormat("0.00");
        double swapContainer;
        
        /* generate and display original list */
        System.out.println("Unsorted:");
        for (int i = 0; i < 10; i++) {
            doublesList.add(Double.parseDouble(roundForm.format(Math.random() * 10)));
            System.out.println(doublesList.get(i));
        }
        
        /* sort list */
        for (int j = 0; j < doublesList.size(); j++) {
            for (int k = j; k < doublesList.size(); k++) {
                if (doublesList.get(k) < doublesList.get(j)) {
                    swapContainer = doublesList.get(j);
                    doublesList.set(j, doublesList.get(k));
                    doublesList.set(k, swapContainer);
                }
            }
        }
        
        /* display sorted list */
        System.out.println("\nSorted:");
        for (int l = 0; l < doublesList.size(); l++) {
            System.out.println(doublesList.get(l));
        }
    }
}