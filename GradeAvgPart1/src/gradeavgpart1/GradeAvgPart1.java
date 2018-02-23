/*
 * GradeAvgPart1.java
 * display the average of 5 grades
 * by christopher mccauley
 */

package gradeavgpart1;

import java.util.Scanner;

/**
 * calculate the average of 5 integers
 */
public class GradeAvgPart1 {

    public static void main(String[] args) {
        int gradeInput = 0;
        double averageGrade;
        Scanner usersInput = new Scanner(System.in);
        
        System.out.println("Input first grade: ");
        gradeInput += usersInput.nextInt();
        System.out.println("Input second grade: ");
        gradeInput += usersInput.nextInt();
        System.out.println("Input third grade: ");
        gradeInput += usersInput.nextInt();
        System.out.println("Input fourth grade: ");
        gradeInput += usersInput.nextInt();
        System.out.println("Input fifth grade: ");
        gradeInput += usersInput.nextInt();
        averageGrade = (double)gradeInput / (double)5;
        System.out.println("The average grade is " + averageGrade);
        
    }

}