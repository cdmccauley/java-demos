/*
 * LinkedListDemo.java
 * linked list demo using a custom linked list for string values
 * by christopher mccauley
 */

package linkedlistdemo;

import java.util.Scanner;

public class LinkedListDemo {
    
    /**
     * populate a LinkedList2 with random strings
     * pre: none
     * post: LinkedList2 is populated
     */
    public static void populateList(LinkedList2 list, int listLength, int stringLength) {
        int toChar;
        char toString;
        String listItem = new String();
        
        for (int i = 0; i < listLength; i++) {
            listItem = new String();
            for (int j = 0; j < stringLength; j++) {
                toChar = (int)(26 * Math.random() + 97); // unicode lowercase range
                toString = (char)toChar;
                listItem += toString;
            }
            list.addAtFront(listItem);
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        LinkedList2 list = new LinkedList2();
        final int LIST_LENGTH = 5;
        final int STRING_LENGTH = 5;
        int optionNum;
        String userString;
        
        populateList(list, LIST_LENGTH, STRING_LENGTH);
        System.out.println("List populated.");
        do {
            System.out.print("\n1. Display List" 
                            + "\n2. Add To List" 
                            + "\n3. Remove From List" 
                            + "\n4. Display List Size" 
                            + "\n5. Exit" 
                            + "\nOption number: ");
            optionNum = userInput.nextInt();
            switch (optionNum) {
                case 1: System.out.print("\n" + list.toString());
                        break;
                case 2: System.out.print("\nEnter string to add: ");
                        userString = userInput.next();
                        list.addAtFront(userString); // addAtFront() test
                        break;
                case 3: System.out.print("\nEnter string to remove: ");
                        userString = userInput.next();
                        list.remove(userString); // remove() test
                        break;
                case 4: System.out.println("\n" + list.size()); // size() test
                        break;
                default:// nothing
                        break;
            }
        } while (optionNum != 5);
    }
}