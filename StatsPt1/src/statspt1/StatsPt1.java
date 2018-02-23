/*
 * StatsPt1.java
 * FileReader and BufferReader demo
 * by christopher mccauley
 */

package statspt1;

import java.io.*;
import java.text.DecimalFormat;

public class StatsPt1 {

    public static void main(String[] args) {
        DecimalFormat decForm = new DecimalFormat("#.##");
        File dataFile = new File("test1.dat");
        FileReader in;
        BufferedReader readFile;
        String lineVal;
        String displayLine = "";
        double avgScore;
        double totalScores = 0.0;
        double lowScore = 100.0;
        double highScore = 0.0;
        int numLines = 0;
        
        try {
            in = new FileReader(dataFile);
            readFile = new BufferedReader(in);
            while ((lineVal = readFile.readLine()) != null) {
                numLines += 1;
                if (numLines % 2 == 0) {
                    System.out.println(displayLine + lineVal);
                    totalScores += Double.parseDouble(lineVal);
                    if (Double.parseDouble(lineVal) > highScore) {
                        highScore = Double.parseDouble(lineVal);
                    }
                    if (Double.parseDouble(lineVal) < lowScore) {
                        lowScore = Double.parseDouble(lineVal);
                    }
                } else {
                    displayLine = lineVal + ": ";
                }
            }
            avgScore = totalScores / (numLines / 2);
            System.out.println("\nAverage score: " + decForm.format(avgScore) 
                    + "\nHigh score: " + decForm.format(highScore) 
                    + "\nLow score: " + decForm.format(lowScore));
            readFile.close();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist or could not be found.");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem reading file.");
            System.err.println("IOException: " + e.getMessage());
        }
    }
}