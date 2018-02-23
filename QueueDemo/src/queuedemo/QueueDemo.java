/*
 * QueueDemo.java
 * 
 * by christopher mccauley
 */

package queuedemo;

import java.util.Scanner;

public class QueueDemo {

    public static void main(String[] args) {
        final int MAX_ITEMS = 3;
        Queue2 q = new Queue2(MAX_ITEMS);
        Scanner input = new Scanner(System.in);
        String choice;
        Object num = new Object();
        
        do {
            System.out.print("Add/Remove/Count/Front/Quit: ");
            choice = input.next();
            if (choice.equalsIgnoreCase("a")) {
                if (q.size() < MAX_ITEMS) {
                    System.out.print("Number to add: ");
                    num = input.next();
                    q.enqueue(num);
                } else {
                    System.out.println("Queue is full.");
                }
            } else if (choice.equalsIgnoreCase("r")) {
                System.out.println("Dequeueing: " + q.dequeue());
            } else if (choice.equalsIgnoreCase("c")) {
                System.out.println("Items in queue: " + q.size());
            } else if (choice.equalsIgnoreCase("f")) {
                System.out.println("Front of queue: " + q.front());
            } else {
                System.out.println("quitting");
            }
        } while (!choice.equalsIgnoreCase("q"));
    }
}