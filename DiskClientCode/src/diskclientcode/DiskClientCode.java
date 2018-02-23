/*
 * DiskClientCode.java
 * interface demo
 * by christopher mccauley
 */

package diskclientcode;

public class DiskClientCode {

    public static void main(String[] args) {
        Disk smallDisk1 = new Disk(1.0, 1.0);
        Disk smallDisk2 = new Disk(3.0, 0.5);
        Disk baseDisk = new Disk(2.0, 2.0);
        Disk equalDisk = new Disk(2.0, 2.0);
        Disk largeDisk1 = new Disk(3.0, 1.0);
        Disk largeDisk2 = new Disk(3.0, 3.0);
        
        System.out.println("Comparing smaller disks to larger disks:\n" + baseDisk.compareTo(smallDisk1) 
                + "\n" + baseDisk.compareTo(smallDisk2));
        
        System.out.println("Comparing equal disks:\n" + baseDisk.compareTo(equalDisk) 
                + "\n" + equalDisk.compareTo(baseDisk));
        
        System.out.println("Comparing larger disks to smaller disks:\n" + baseDisk.compareTo(largeDisk1) 
                + "\n" + baseDisk.compareTo(largeDisk2));
    }

}