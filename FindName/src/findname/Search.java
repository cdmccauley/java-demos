/*
 * search class
 */
package findname;

public class Search {
    
    /**
     * linear method for integers
     * pre: none
     * post: returns an integer
     */
    public static int linear(int[] array, int numToFind) {
        int index = 0;
        
        while ((array[index] != numToFind && (index < array.length - 1))) {
            index += 1;
        }
        
        if (array[index] == numToFind) {
            return(index);
        } else {
            return(-1);
        }
    }
    
    /**
     * linear method for strings
     * pre: none
     * post: returns an integer
     */
    public static int linear(String[] array, String stringToFind) {
        int index = 0;
        
        while ((array[index].toLowerCase().compareTo(stringToFind.toLowerCase()) 
                != 0 && (index < array.length - 1))) {
            index += 1;
        }
        
        if (array[index].toLowerCase().compareTo(stringToFind.toLowerCase()) == 0) {
            return(index);
        } else {
            return(-1);
        }
    }
}