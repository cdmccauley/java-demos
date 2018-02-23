/*
 * StackDemo.java
 * custom stack data structure demo
 * by christopher mccauley
 */

package stackdemo;

public class StackDemo {

    public static void main(String[] args) {
        Stack2 s = new Stack2(10);
        
        System.out.println("Adding A_STRING and 13 to Stack");
        s.push("A_STRING");
        s.push(13);
        
        System.out.println("Top of stack: " + s.top());
        System.out.println("Items in stack: " + s.size());
        System.out.println("Removing top item.");
        s.pop();
        System.out.println("Top of stack: " + s.top());
        System.out.println("Items in stack: " + s.size());
        System.out.println("Adding a new item");
        s.push(40.20);
        System.out.println("Top of stack: " + s.top());
        System.out.println("Items in stack: " + s.size());
        
    }
}