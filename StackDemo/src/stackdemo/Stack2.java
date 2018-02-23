/*
 * Stack2 class
 */

package stackdemo;

public class Stack2 {
    private Object[] data;
    private int top;
    
    /**
     * constructor
     * pre: none
     * post: variables initialized
     */
    public Stack2(int maxItems) {
        data = new Object[maxItems];
        top = -1;
    }
    
    /**
     * return value on top of stack
     * pre: none
     * post: value at index 'top' is returned
     */
    public Object top() {
        return data[top];
    }
    
    /**
     * remove vale on top of stack
     * pre: none
     * post: value that has been 'removed' is returned
     */
    public Object pop() {
        top -= 1;
        return(data[top + 1]);
    }
    
    /**
     * add an item to the top of the stack
     * pre: none
     * post: value has been assigned to index 'top'
     */
    public void push(Object num) {
        if (top < data.length - 1) {
            top += 1;
            data[top] = num;
        }
    }
    
    /**
     * determine if stack is empty
     * pre: none
     * post: returns boolean
     */
    public boolean isEmpty() {
        if (top == -1) {
            return(true);
        } else {
            return(false);
        }
    }
    
    /**
     * returns the number of items in the stack
     * pre: none
     * post: returns integer
     */
    public int size() {
        if (isEmpty()) {
            return(0);
        } else {
            return(top + 1);
        }
    }
    
    /**
     * empties the stack
     * pre: none
     * post: integer assigned to 'top'
     */
    public void makeEmpty() {
        top = -1;
    }
}