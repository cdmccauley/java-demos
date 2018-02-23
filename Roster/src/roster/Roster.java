/*
 * Roster.java
 * java serialization and deserialization demo
 * by christopher mccauley
 */

package roster;

import java.io.*;
import java.util.Scanner;

public class Roster {

    public static void main(String[] args) {
        File studentRoster;
        Scanner userInput = new Scanner(System.in);
        String fileName, firstName, lastName;
        int numStudents;
        
        try {
            /* get file name */
            System.out.print("Save file as: ");
            fileName = userInput.next() + ".dat";
            studentRoster = new File(fileName);
            
            /* get number of students */
            do {
                System.out.print("Enter number of students: ");
                numStudents = userInput.nextInt();
            } while (numStudents < 0);
            
            /* output Students to file */
            FileOutputStream out = new FileOutputStream(studentRoster);
            ObjectOutputStream writeOut = new ObjectOutputStream(out);
            for (int i = 0; i < numStudents; i++) {
                System.out.print("Enter student's first name: ");
                firstName = userInput.next();
                System.out.print("Enter student's last name: ");
                lastName = userInput.next();
                writeOut.writeObject(new StuName(firstName, lastName));
            }
            writeOut.close();
            
            /* read Students from file */
            FileInputStream in = new FileInputStream(studentRoster);
            ObjectInputStream readIn = new ObjectInputStream(in);
            for (int j = 0; j < numStudents; j++) {
                StuName readStudent = (StuName)readIn.readObject();
                System.out.println(readStudent);
            }
            readIn.close();
            
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("ClassNotFoundException: " + e.getMessage());
        }
        
    }
}