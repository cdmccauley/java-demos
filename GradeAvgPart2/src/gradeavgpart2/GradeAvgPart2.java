/*
 * GradeAvgPart2.java
 * display the average of 5 grades
 * by christopher mccauley
 */

package gradeavgpart2;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 * calculate the average of 5 integers
 */
public class GradeAvgPart2 {

    public static void main(String[] args) {
        int gradeInput = 0;
        double averageGrade;
        Scanner usersInput = new Scanner(System.in);
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        
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
        averageGrade = ((double)gradeInput / (double)5) / (double)100;
        System.out.println("The average grade is " + percentFormat.format(averageGrade));
        
    }

}