/*
 * StuName class
 */

package roster;

import java.io.*;

public class StuName implements Serializable{
    private String firstName, lastName;
    
    /**
     * constructor
     * pre: none
     * post: initializes variables
     */
    public StuName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    /**
     * toString method
     * pre: none
     * post: returns string representing StuName
     */
    public String toString() {
        String studentString;
        
        studentString = lastName + ", " + firstName;
        return(studentString);
    }
}