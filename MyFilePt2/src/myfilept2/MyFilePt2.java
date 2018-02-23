/*
 * MyFilePt2.java
 * Java File object demo
 * by christopher mccauley
 */

package myfilept2;

import java.io.*;
import java.util.Scanner;

public class MyFilePt2 {
    
    /**
     * displays a status message
     * pre: none
     * post: displays a message
     */
    public static void fileStatus(File txtFile, String fileName) {
        if (!(txtFile.exists())) {
            System.out.println(fileName + " has been deleted.");
        } else {
            System.out.println(fileName + " has been created.");
        }
        
    }

    public static void main(String[] args) {
        String fileName = "zzz.txt";
        File txtFile = new File(fileName);
        Scanner userInput = new Scanner(System.in);
        String option;
        
        /* clean up any prior run */
        if (txtFile.exists()) {
            txtFile.delete();
        }
        
        try {
            txtFile.createNewFile();
            fileStatus(txtFile, fileName);
            System.out.print("Would you like to keep or delete " + fileName + "?" + "\nType DELETE to delete: ");
            option = userInput.next();
            if (option.equals("DELETE")) {
                txtFile.delete();
                fileStatus(txtFile, fileName);
            }

        } catch (IOException e) {
            System.out.println("File could not be created.");
            System.err.println("IOException: " + e.getMessage());
        }
        
    }
}