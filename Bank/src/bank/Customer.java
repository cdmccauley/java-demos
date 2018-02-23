/*
 * Customer class
 */
package bank;

public class Customer {
    private String firstName, lastName, street, city, state, zip;
    
    /**
     * constructor
     * pre: none
     * post: A Customer object has been created.
     * Customer data has been initialized with parameters
     */
    public Customer(String fName, String lName, String str, String c, String s, String z) {
        firstName = fName;
        lastName = lName;
        street = str;
        city = c;
        state = s;
        zip = z;
    }
    
    /**
     * Returns a String that represents the Customer object.
     * pre: none
     * post: A string representing the Account object has been returned.
     */
    public String toString() {
        String custString;
        
        custString = firstName + " " + lastName + "\n";
        custString += street + "\n";
        custString += city + ", " + state + " " + zip + "\n";
        return(custString);
    }
    
    /**
     * re-assigns customers street
     * pre: none
     * post: street changed
     */
    public void changeStreet(String newStreet) {
        street = newStreet;
    }
    
    /**
     * re-assigns customers city
     * pre: none
     * post: city changed
     */
    public void changeCity(String newCity) {
        city = newCity;
    }
    
    /**
     * re-assigns customers state
     * pre: none
     * post: state changed
     */
    public void changeState(String newState) {
        state = newState;
    }
    
    /**
     * re-assigns customers zip
     * pre: none
     * post: zip changed
     */
    public void changeZip(String newZip) {
        zip = newZip;
    }
    
}
