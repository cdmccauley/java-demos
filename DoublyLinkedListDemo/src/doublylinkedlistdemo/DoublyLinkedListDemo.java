/*
 * DoublyLinkedListDemo.java
 * demo of custom doubly linked list
 * by christopher mccauley
 */

package doublylinkedlistdemo;

import java.util.Scanner;

public class DoublyLinkedListDemo {
    public static void populateList(DoublyLinkedList list, int listLength, int stringLength) {
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
        DoublyLinkedList list = new DoublyLinkedList();
        final int LIST_LENGTH = 5;
        final int STRING_LENGTH = 5;
        int optionNum;
        Object userData;
        
        populateList(list, LIST_LENGTH, STRING_LENGTH);
        System.out.println("List populated.");
        do {
            System.out.print("\n1. Display List From First" 
                            + "\n2. Display List From Last"
                            + "\n3. Add To Front Of List" 
                            + "\n4. Add To End Of List" 
                            + "\n5. Remove Data From Front" 
                            + "\n6. Remove Data From End"
                            + "\n7. Exit\n" 
                            + "\nOption number: ");
            optionNum = userInput.nextInt();
            switch (optionNum) {
                case 1: System.out.print("\n" + list.displayList()); // displayList() test
                        break;
                case 2: System.out.print("\n" + list.displayReverseList()); // displayReverseList() test
                        break;
                case 3: System.out.print("\nEnter data to add: ");
                        userData = userInput.next();
                        list.addAtFront(userData); // addAtFront() test
                        break;
                case 4: System.out.print("\nEnter data to add: ");
                        userData = userInput.next();
                        list.addAtEnd(userData); // addAtEnd() test
                        break;
                case 5: System.out.print("\nEnter data to remove: ");
                        userData = userInput.next();
                        list.removeAtFront(userData); // removeAtFront() test
                        break;
                case 6: System.out.print("\nEnter data to remove: ");
                        userData = userInput.next();
                        list.removeAtEnd(userData); // removeAtEnd() test
                        break;
                default:// nothing
                        break;
            }
        } while (optionNum != 7);
    }
}