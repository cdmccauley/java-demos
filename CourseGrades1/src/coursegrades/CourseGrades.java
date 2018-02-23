/*
 * CourseGrades.java
 * store and calculate students test grades and averages
 * by christopher mccauley
 */

package coursegrades;

import java.util.Scanner;

public class CourseGrades {
    
    /**
     * displays a menu enabling interaction with grade book
     * pre: none
     * post: option 5 is selected
     */
    public static void main(String[] args) {
        final int STUDENTS = 3;
        final int TESTS = 3;
        GradeBook classGrades = new GradeBook(STUDENTS, TESTS);
        Scanner userInput = new Scanner(System.in);
        int menuSelect, studentSelect, testSelect;
        
        System.out.println("Welcome to the Grade Book. Grades must be entered to start.");
        classGrades.getGrades();
        do {
            System.out.print("\nMenu:"
                    + "\n1. Re-enter grades"
                    + "\n2. View class grades"
                    + "\n3. View student averages"
                    + "\n4. View test averages"
                    + "\n5. Exit\n");
            menuSelect = userInput.nextInt();
            switch (menuSelect) {
                case 1:
                    classGrades.getGrades();
                    break;
                case 2:
                    classGrades.showGrades();
                    break;
                case 3:
                    System.out.print("Enter a student ID: ");
                    studentSelect = userInput.nextInt();
                    System.out.println(classGrades.studentAvg(studentSelect));
                    break;
                case 4:
                    System.out.print("Enter a test number: ");
                    testSelect = userInput.nextInt();
                    System.out.println(classGrades.testAvg(testSelect));
                    break;
                default:
                    break;
            }
        } while (!(menuSelect == 5));
    }
}