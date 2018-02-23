/*
 * NamePt1.java
 * java gui demo
 * by christopher mccauley
 */

package namept1;

import javax.swing.*;

public class NamePt1 {
    final static String LABEL_TEXT = "Christopher McCauley";
    JFrame frame;
    JPanel contentPane;
    JLabel label;
    
    public NamePt1() {
        /* create and set up the frame */
        frame = new JFrame("NamePt1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* create a content pane */
        contentPane = new JPanel();

        /* create and add label */
        label = new JLabel(LABEL_TEXT);
        contentPane.add(label);

        /* add content pane to frame */
        frame.setContentPane(contentPane);

        /* size and then display the frame */
        frame.pack();
        frame.setVisible(true);
    }
    
    /**
     * create and show the gui
     */
    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        NamePt1 myName = new NamePt1();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
            }
        });
    }
}