/*
 * LinkedList class
 */

package linkedlistdemo;

public class LinkedList {
    private Node head;
    
    /**
     * 
     */
    public LinkedList() {
        head = null;
    }
    
    /**
     * 
     */
    public void addAtFront(String str) {
        Node newNode = new Node(str);
        newNode.setNext(head);
        head = newNode;
    }
    
    /**
     * 
     */
    public void remove(String str) {
        Node current = head;
        Node previous = head;
        
        if (current.getData().equals(str)) {
            head = current.getNext();
        } else {
            while (current.getNext() != null) {
                previous = current;
                current = current.getNext();
                if (current.getData().equals(str)) {
                    previous.setNext(current.getNext());
                }
            }
        }
    }
    
    /**
     * 
     */
    public String toString() {
        Node current = head;
        String listString;
        
        System.out.println("toString called");
        if (current != null) {
            System.out.println("line 55");
            listString = current.getData() + "\n";
            while (current.getNext() != null) {
                System.out.println("line 58");
                current.getNext();
                listString += current.getData() + "\n";
            }
            System.out.println("line 62");
            return(listString);
        } else {
            System.out.println("line 65");
            return("There are no items in list.");
        }
    }
    
    /**
     * 
     */
    private class Node {
        private String data;
        private Node next;
        
        /**
         * 
         */
        public Node(String newData) {
            data = newData;
            next = null;
        }
        
        /**
         * 
         */
        public Node getNext() {
            return(next);
        }
        
        /**
         * 
         */
        public void setNext(Node newNode) {
            next = newNode;
        }
        
        /**
         * 
         */
        public String getData() {
            return(data);
        }
    }
}