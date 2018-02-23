/*
 * GradeBook class
 */

package coursegrades;

import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class GradeBook implements Serializable {
    DecimalFormat gradeForm;
    transient Scanner userInput;
    int numStudents, numTests;
    int[][] grades;
    
    /**
     * constructor
     * pre: none
     * post: variables initialized
     */
    public GradeBook(int numStudents, int numTests) {
        gradeForm = new DecimalFormat("###.##");
        userInput = new Scanner(System.in);
        grades = new int[numStudents + 1][numTests + 1];
        this.numStudents = numStudents;
        this.numTests = numTests;
        
        for (int i = 1; i <= numStudents; i++) {
            grades[i][0] = i;
        }
    }
    
    /**
     * store student grades for tests
     * pre: none
     * post: all student grades entered
     */
    public void getGrades() {
        for (int i = 1; i <= numStudents; i++) {
            for (int j = 1; j <= numTests; j++) {
                System.out.print("Enter test " + j + " score for student " + i + ": ");
                grades[i][j] = userInput.nextInt();
            }
        }
    }
    
    /**
     * display student grades for tests
     * pre: none
     * post: displays test scores
     */
    public void showGrades() {
        System.out.println("Student\tTest 1\tTest 2\tTest 3");
        for (int i = 1; i <= numStudents; i++) {
            for (int j = 0; j <= numTests; j++) {
                System.out.print(grades[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
    
    /**
     * calculate a student's average score across tests
     * pre: none
     * post: returns string
     */
    public String studentAvg(int studentID) {
        double avg = 0.0;
        int counter = 0;
        
        for (int i = 1; i <= numTests; i++) {
            avg += grades[studentID][i];
            counter++;
        }
        return("Student " + studentID + " average: " + gradeForm.format(avg / (double)counter));
    }
    
    /**
     * calculate and display average score for a test
     * pre: none
     * post: returns string
     */
    public String testAvg(int testID) {
        double avg = 0.0;
        int counter = 0;
        
        for (int i = 1; i <= numStudents; i++) {
            avg += grades[i][testID];
            counter++;
        }
        return("Test " + testID + " average: " + gradeForm.format(avg / (double)counter));
    }
}