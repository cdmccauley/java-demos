/*
 * CourseGrades.java
 * store and calculate students test grades and averages using serialization
 * by christopher mccauley
 */

package coursegrades;

import java.io.*;
import java.util.Scanner;

public class CourseGrades {
    
    /**
     * displays a menu enabling interaction with grade book
     * pre: none
     * post: option 4 is selected
     */
    public static void main(String[] args) {
        final int STUDENTS = 3;
        final int TESTS = 3;
        String fileName = "grade-book.dat";
        File gradeBook = new File(fileName);
        GradeBook classGrades = new GradeBook(STUDENTS, TESTS);
        Scanner userInput = new Scanner(System.in);
        int menuSelect, studentSelect, testSelect;
        FileOutputStream out;
        ObjectOutputStream writeOut;
        FileInputStream in;
        ObjectInputStream readIn;
        GradeBook readGBook;
        
        try {
            System.out.println("Welcome to Grade Book.");
            /* read from existing or create new file*/
            if (gradeBook.exists()) {
                do {
                    System.out.print("\nA grade book exists.\n" 
                            + "\nMenu:" 
                            + "\n1. Open existing grade book." 
                            + "\n2. Create new grade book." 
                            + "\nOption number: ");
                    menuSelect = userInput.nextInt();
                    switch (menuSelect) {
                        case 1:
                            System.out.println("Opening " + fileName);
                            break;
                        case 2:
                            gradeBook.delete();
                            break;
                        default:
                            break;
                    }
                } while (!(menuSelect == 1) && !(menuSelect == 2));
            } 
            /* no file, create grade book file*/
            if (!(gradeBook.exists())) {
                System.out.println("\nEnter grades to create new grade book.\n");
                classGrades.getGrades();
                out = new FileOutputStream(gradeBook);
                writeOut = new ObjectOutputStream(out);
                writeOut.writeObject(classGrades);
                writeOut.close();
            }
            /* interact with chosen grade book file */
            do {
                in = new FileInputStream(gradeBook);
                readIn = new ObjectInputStream(in);
                readGBook = (GradeBook)readIn.readObject();
                System.out.print("\nMenu:" 
                        + "\n0. Re-enter grades"
                        + "\n1. View class grades"
                        + "\n2. View student averages"
                        + "\n3. View test averages"
                        + "\n4. Exit" 
                        + "\nOption number: ");
                menuSelect = userInput.nextInt();
                switch (menuSelect) {
                    case 0:
                        classGrades.getGrades();
                        out = new FileOutputStream(gradeBook);
                        writeOut = new ObjectOutputStream(out);
                        writeOut.writeObject(classGrades);
                        writeOut.close();
                        break;
                    case 1:
                        readGBook.showGrades();
                        break;
                    case 2:
                        System.out.print("Enter a student ID: ");
                        studentSelect = userInput.nextInt();
                        System.out.println(readGBook.studentAvg(studentSelect));
                        break;
                    case 3:
                        System.out.print("Enter a test number: ");
                        testSelect = userInput.nextInt();
                        System.out.println(readGBook.testAvg(testSelect));
                        break;
                    default:
                        break;
                }
                readIn.close();
            } while (!(menuSelect == 4));
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("ClassNotFoundException: " + e.getMessage());
        }
    }
}