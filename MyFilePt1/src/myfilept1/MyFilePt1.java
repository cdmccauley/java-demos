/*
 * MyFilePt1.java
 * check if a file is in the project folder
 * by christopher mccauley
 */

package myfilept1;

import java.io.*;
import java.util.Scanner;

public class MyFilePt1 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String fileName;
        File checkForFile;
        
        System.out.print("Enter a file name to check if it exists: ");
        fileName = userInput.next();
        checkForFile = new File(fileName);
        
        if (checkForFile.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }
        
    }
}