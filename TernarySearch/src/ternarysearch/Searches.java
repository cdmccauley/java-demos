/*
 * Searches class
 * includes methods to perform searches on an array
 * by christopher mccauley
 */

package ternarysearch;

public class Searches {
    
    /**
     * perform binary search on an array
     * pre: none
     * post: returns index of goal or -1 to indicate not found
     */
    public static int binarySearch(int[] items, int start, int end, int goal, int counter) {
        counter += 1;
        if (start > end) {
            return(-1);
        } else {
            int mid = (start + end) / 2;
            if (goal == items[mid]) {
                System.out.print("\nBinary search found " + goal + " in " + counter + " attempts");
                return(mid);
            } else if (goal < items[mid]) {
                return(binarySearch(items, start, mid - 1, goal, counter));
            } else {
                return(binarySearch(items, mid + 1, end, goal, counter));
            }
        }
    }
    
    /**
     * perform ternary search on an array
     * pre: none
     * post: returns index of goal or -1 to indicate not found
     */
    public static int ternarySearch(int[] items, int start, int end, int goal, int counter) {
        counter += 1;
        if (end >= start) {
            int mid1 = start + (end - start) / 3;
            if (items[mid1] == goal) {
                System.out.print("\nTernary search found " + goal + " in " + counter + " attempts");
                return(mid1);
            }
            int mid2 = end - (end - start) / 3;
            if (items[mid2] == goal) {
                System.out.print("\nTernary search found " + goal + " in " + counter + " attempts");
                return(mid2);
            }
            if (goal < items[mid1]) {
                return ternarySearch(items, start, mid1 - 1, goal, counter);
            } else if (goal > items[mid2]) {
                return ternarySearch(items, mid2 + 1, end, goal, counter);
            } else {
                return ternarySearch(items, mid1 + 1, mid2 - 1, goal, counter);
            }
        }
        return (-1);
    }
    
    
}