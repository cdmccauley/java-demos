/*
 * StudentRoster.java
 * create and display a student roster
 * by christopher mccauley
 */

package studentroster;

import java.util.Scanner;

public class StudentRoster {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int numStudents;
        String[] studentNames;
        
        System.out.print("How many students are in the class? ");
        numStudents = userInput.nextInt();
        studentNames = new String[numStudents];
        for (int i = 0; i < studentNames.length; i++) {
            System.out.print("Enter a name: ");
            studentNames[i] = userInput.next();
        }
        System.out.println("\nStudent Roster");
        for (int j = 0; j < studentNames.length; j++) {
            System.out.print(studentNames[j] + "\n");
        }
    }
}