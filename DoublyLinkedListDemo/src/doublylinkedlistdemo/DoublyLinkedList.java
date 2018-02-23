/*
 * DoublyLinkedList class
 * note: include addAtFront(), addAtEnd(), remove(), 
 * displayList(), and displayReverseList()
 */

package doublylinkedlistdemo;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    
    /**
     * constructor
     * pre: none
     * post: variables initialized
     */
    public DoublyLinkedList() {
        head = null;
        tail = null;
    }
    
    /**
     * add data to the front of the list
     * pre: none
     * post: head is assigned new node
     */
    public void addAtFront(Object listItem) {
        Node newNode = new Node(listItem);
        
        if (head == null) { // start new list
            newNode.setNext(head);
            head = newNode;
            tail = newNode;
        } else { // add to existing list
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        }
    }
    
    /**
     * add data to the end of the list
     * pre: none
     * post: tail is assigned new node
     */
    public void addAtEnd(Object listItem) {
        Node newNode = new Node(listItem);
        
        if (tail == null) { // start new list
            newNode.setPrevious(tail);
            tail = newNode;
            head = newNode;
        } else { // add to existing list
            newNode.setPrevious(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
    }
    
    /**
     * search for then remove data starting from head
     * pre: none
     * post: instance of data closest to head is removed or data does not exist in list
     */
    public void removeAtFront(Object data) {
        Node current = head;
        Node previous = head;
        
        if (head == null && tail == null) {
            System.out.println("\nThe list is empty.");
        } else if (current.getData().equals(data)) {
            /* head is the item to remove */
            if (current.getPrevious() == null && current.getNext() == null) {
                /* head is tail and last item in list */
                head = null;
                tail = null;
            } else {
                /* head is not last item in list */
                head = current.getNext();
                head.setPrevious(null);
            }
        } else {
            /* the item is not head */
            while (current.getNext() != null) {
                /* iterate from head to tail */
                previous = current;
                current = current.getNext();
                if (current.getData().equals(data) && current.getNext() == null) {
                    /* current is the item to remove and is last item in list */
                    previous.setNext(current.getNext());
                    tail = current.getPrevious();
                } else if (current.getData().equals(data)) {
                    /* current is the item to remove and not last item in list */
                        previous.setNext(current.getNext());
                        current = current.getNext();
                        current.setPrevious(previous);
                }
            }
        }
    }
    
    /**
     * search for then remove data starting from tail
     * pre: none
     * post: instance of data closest to tail is removed or data does not exist in list
     */
    public void removeAtEnd(Object data) {
        Node current = tail;
        Node previous = tail;
        
        if (head == null && tail == null) {
            System.out.println("\nThe list is empty.");
        } else if (current.getData().equals(data)) {
            /* tail is the item to remove */
            if (current.getPrevious() == null && current.getNext() == null) {
                /* tail is head and last item in list */
                head = null;
                tail = null;
            } else {
                /* tail is not last item in list */
                tail = current.getPrevious();
                tail.setNext(null);
            }
        } else {
            /* the item is not tail */
            while (current.getPrevious() != null) {
                /* iterate from tail to head */
                previous = current;
                current = current.getPrevious();
                if (current.getData().equals(data) && current.getPrevious() == null) {
                    /* current is the item to remove and is last item in list */
                    previous.setPrevious(current.getPrevious());
                    head = current.getNext();
                } else if (current.getData().equals(data)) {
                    /* current is the item to remove and not last item in list */
                    previous.setPrevious(current.getPrevious());
                    current = current.getPrevious();
                    current.setNext(previous);
                }
            }
        }
    }
    
    /**
     * display the list from head to tail
     * pre: none
     * post: string representation of list returned
     */
    public String displayList() {
        Node current = head;
        Object listString;
        
        if (current != null) {
            listString = current.getData();
            while (current.getNext() != null) {
                current = current.getNext();
                listString += " <-> " + (String)current.getData();
            }
            listString += "\n";
            return((String)listString);
        } else {
            return("There are no items in the list.\n");
        }
    }
    
    /**
     * display the list from tail to head
     * pre: none
     * post: string representation of list returned
     */
    public String displayReverseList() {
        Node current = tail;
        Object listString;
        
        if (current != null) {
            listString = current.getData();
            while (current.getPrevious() != null) {
                current = current.getPrevious();
                listString += " <-> " + (String)current.getData();
            }
            listString += "\n";
            return((String)listString);
        } else {
            return("There are no items in the list.\n");
        }
    }
    
    private class Node {
        private Object data;
        private Node next;
        private Node previous;
        
        /**
         * constructor
         * pre: none
         * post: variables initialized
         */
        public Node(Object nodeData) {
            data = nodeData;
            next = null;
            previous = null;
        }
        
        /**
         * get the data stored in the node
         * pre: none
         * post: object returned
         */
        public Object getData() {
            return(data);
        }
        
        /**
         * get the next node in list
         * pre: none
         * post: node returned
         */
        public Node getNext() {
            return(next);
        }
        
        /**
         * get the previous node in list
         * pre: none
         * post: node returned
         */
        public Node getPrevious() {
            return(previous);
        }
        
        /**
         * set node next pointer
         * pre: none
         * post: node next pointer variable assigned
         */
        public void setNext(Node nextNode) {
            next = nextNode;
        }
        
        /**
         * set node previous pointer
         * pre: none
         * post: node previous pointer variable assigned
         */
        public void setPrevious(Node previousNode) {
            previous = previousNode;
        }
    }
}