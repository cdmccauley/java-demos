/*
 * LinkedList2 class
 */

package linkedlistdemo;

public class LinkedList2 {
    private Node head;
    
    /**
     * constructor
     * pre: none
     * post: variable initialized
     */
    public LinkedList2() {
        head = null;
    }
    
    /**
     * add an item to the head of the list
     * pre: none
     * post: node is created and assigned to head
     */
    public void addAtFront(String str) {
        Node newNode = new Node(str);
        newNode.setNext(head);
        head = newNode;
    }
    
    /**
     * remove item from list
     * pre: none
     * post: first instance of str is removed or does not exist
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
     * string representation of list
     * pre: none
     * post: prints all values in linked list
     */
    public String toString() {
        Node current = head;
        String listString;
        
        if (current != null) {
            listString = current.getData();
            while (current.getNext() != null) {
                current = current.getNext();
                listString += " -> " + current.getData();
            }
            listString += "\n";
            return(listString);
        } else {
            return("There are no items in the list.\n");
        }
    }
    
    /**
     * get list size
     * pre: none
     * post: returns integer count of items in list
     */
    public int size() {
        Node current = head;
        int counter = 1;
        
        if (current != null) {
            while (current.getNext() != null) {
                counter += 1;
                current = current.getNext();
            }
        } else {
            counter = 0;
        }
        return(counter);
    }
        
        /* start nested class */
        private class Node {
        private String data;
        private Node next;
        
        /**
         * constructor
         * pre: none
         * post: variables initialized
         */
        public Node(String newData) {
            data = newData;
            next = null;
        }
        
        /**
         * return the value of the next node
         * pre: none
         * post: returns node object
         */
        public Node getNext() {
            return(next);
        }
        
        /**
         * assign the value of the next node
         * pre: none
         * post: pointer for node re-assigned
         */
        public void setNext(Node newNode) {
            next = newNode;
        }
        
        /**
         * get stored value from node
         * pre: none
         * post: returns string
         */
        public String getData() {
            return(data);
        }
    }
}