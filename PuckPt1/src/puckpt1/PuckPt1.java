/*
 * PuckPt1.java
 * inheritance and polymorphism demo
 * by christopher mccauley
 */

package puckpt1;

public class PuckPt1 {

    public static void main(String[] args) {
        Puck testPuck1 = new Puck(4.2);
        Puck testPuck2 = new Puck(5.2);
        Puck testPuck3 = new Puck(1.0);
        Disk testDisk1 = new Disk();
        Disk testDisk2 = new Disk(1.5, 1.0);
        
        System.out.println("*.toString() tests:" 
                + "\ntestPuck1: " + testPuck1.toString()
                + "\ntestPuck2: " + testPuck2.toString()
                + "\ntestPuck3: " + testPuck3.toString()
                + "\ntestDisk1: " + testDisk1.toString()
                + "\ntestDisk2: " + testDisk2.toString()
                + "\n");
        
        System.out.println("*.equals() tests:" 
                + "\ntestPuck1.equals(testPuck2): " + testPuck1.equals(testPuck2)
                + "\ntestPuck2.equals(testPuck2): " + testPuck2.equals(testPuck2)
                + "\ntestDisk1.equals(testDisk1): " + testDisk1.equals(testDisk1)
                + "\ntestDisk1.equals(testPuck3): " + testDisk1.equals(testPuck3)
                + "\ntestDisk2.equals(testDisk1): " + testDisk2.equals(testDisk1)
                + "\ntestDisk2.equals(testPuck1): " + testDisk2.equals(testPuck1)
                + "\n");
        
        System.out.println("*.getWeight() tests:" 
                + "\ntestPuck1: " + testPuck1.getWeight()
                + "\ntestPuck2: " + testPuck2.getWeight()
                + "\ntestPuck3: " + testPuck3.getWeight()
                + "\n");
        
        System.out.println("*.getDivision() tests:" 
                + "\ntestPuck1: " + testPuck1.getDivision()
                + "\ntestPuck2: " + testPuck2.getDivision()
                + "\ntestPuck3: " + testPuck3.getDivision()
                + "\n");
    }
}