/*
 * Queue2 class
 */

package queuedemo;

public class Queue2 {
    private Object[] data;
    private int front, rear, maxSize;
    
    /**
     * constructor
     */
    public Queue2(int maxItems) {
        data = new Object[maxItems];
        front = -1;
        rear = -1;
        maxSize = maxItems;
    }
    
    /**
     * 
     */
    public Object front() {
        return(data[front]);
    }
    
    /**
     * 
     */
    public Object dequeue() {
        Object num;
        
        num = data[front];
        if (front == rear) {
            makeEmpty();
        } else {
            front = (front + 1) % maxSize;
        }
        return(num);
    }
    
    /**
     * 
     */
    public void enqueue(Object num) {
        if (isEmpty()) {
            rear = 0;
            front = 0;
            data[rear] = num;
        } else {
            rear = (rear + 1) % maxSize;
            data[rear] = num;
        }
    }
    
    /**
     * 
     */
    public boolean isEmpty() {
        if (front == -1 && rear == -1) {
            return(true);
        } else {
            return(false);
        }
    }
    
    /**
     * 
     */
    public int size() {
        if (isEmpty()) {
            return(0);
        } else {
            if (rear > front) {
                return(rear - front + 1);
            } else if (front == rear + 1) {
                return(maxSize);
            } else {
                return(front - rear + 1);
            }
        }
    }
    
    /**
     * 
     */
    public void makeEmpty() {
        front = -1;
        rear = -1;
    }
}