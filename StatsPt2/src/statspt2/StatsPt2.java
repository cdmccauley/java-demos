/*
 * StatsPt2.java
 * Java FileWriter and BufferedWriter demo
 * by christopher mccauley
 */

package statspt2;

import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class StatsPt2 {

    public static void main(String[] args) {
        File dataFile;
        Scanner userInput = new Scanner(System.in);
        DecimalFormat decForm = new DecimalFormat("#.##");
        FileWriter out;
        BufferedWriter writeFile;
        FileReader in;
        BufferedReader readFile;
        String name, fileName, lineVal;
        double score, avgScore;
        double totalScores = 0.0;
        double lowScore = 100.0;
        double highScore = 0.0;
        int numStudents;
        int numLines = 0;
        
        try {
            /* get file name */
            System.out.print("Save file as: ");
            fileName = userInput.next() + ".dat";
            dataFile = new File(fileName);
            
            /* get number of scores */
            do {
                System.out.print("Enter number of students: ");
                numStudents = userInput.nextInt();
            } while (numStudents < 0);
            
            /* write to file */
            out = new FileWriter(dataFile);
            writeFile = new BufferedWriter(out);
            for (int i = 0; i < numStudents; i++) {
                System.out.print("Enter student name: ");
                name = userInput.next();
                System.out.print("Enter test score: ");
                score = userInput.nextDouble();
                writeFile.write(name);
                writeFile.newLine();
                writeFile.write(String.valueOf(score));
                writeFile.newLine();
            }
            writeFile.close();
            out.close();
            
            /* read from file */
            in = new FileReader(dataFile);
            readFile = new BufferedReader(in);
            while ((lineVal = readFile.readLine()) != null) {
                numLines += 1;
                if (numLines % 2 == 0) {
                    totalScores += Double.parseDouble(lineVal);
                    if (Double.parseDouble(lineVal) >= highScore) {
                        highScore = Double.parseDouble(lineVal);
                    }
                    if (Double.parseDouble(lineVal) <= lowScore) {
                        lowScore = Double.parseDouble(lineVal);
                    }
                }
            }
            avgScore = totalScores / (numLines / 2);
            
            /* display stats */
            System.out.println("\nAverage score: " + decForm.format(avgScore) 
                    + "\nHigh score: " + decForm.format(highScore) 
                    + "\nLow score: " + decForm.format(lowScore));
            readFile.close();
            in.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist or could not be found.");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem reading from, or writing to file.");
            System.err.println("IOException: " + e.getMessage());
        }
    }
}