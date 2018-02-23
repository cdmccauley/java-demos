/*
 * WinterOlympics.java
 * view and create winter olympic event records
 * by christopher mccauley
 */

package winterolympics;

public class WinterOlympics {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                WinterOlympicsGUI.runGUI();
            }
        });
    }
}