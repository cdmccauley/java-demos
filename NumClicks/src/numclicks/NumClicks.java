/*
 * NumClicks.java
 * java gui demo
 * by christopher mccauley
 */

package numclicks;

import javax.swing.*;
import java.awt.event.*;

public class NumClicks implements ActionListener {
    JFrame frame;
    JPanel contentPane;
    JButton button;
    int counter;
    String btnMessage;
    
    public NumClicks() {
        counter = 0;
        btnMessage = "You have clicked " + counter + " times.";
        
        /* create and set up the frame */
        frame = new JFrame("NumClicks");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /* create a content pane */
        contentPane = new JPanel();
        
        /* create and add button */
        button = new JButton(btnMessage);
        button.addActionListener(this);
        contentPane.add(button);
        
        /* add content pane to frame */
        frame.setContentPane(contentPane);
        
        /* size and then dsplay the frame */
        frame.pack();
        frame.setVisible(true);
    }
    
    /**
     * handle button click action event
     * pre: none
     * post: button updates text with counter number
     */
    public void actionPerformed(ActionEvent event) {
        counter += 1;
        btnMessage = "You have clicked " + counter + " times.";
        button.setText(btnMessage);
    }
    
    /**
     * create and show the gui
     */
    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        NumClicks clickCounter = new NumClicks();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
            }
        });
    }
}