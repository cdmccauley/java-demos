/*
 * Riddle.java
 * java gui demo
 * by christopher mccauley
 */

package riddle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Riddle implements ActionListener {
    JFrame frame;
    JPanel contentPane;
    JLabel label1, label2;
    JButton button1;
    
    public Riddle() {
        /* create and set up the frame */
        frame = new JFrame("Riddle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /* create a content pane */
        contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(2, 0, 10, 10));
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        /* create and add label1 */
        label1 = new JLabel("Why did the chicken cross the road?");
        label1.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
        contentPane.add(label1);
        
        /* create and add label2 */
        label2 = new JLabel(" ");
        label2.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
        contentPane.add(label2);
        
        /* create and add button1 */
        button1 = new JButton("Answer");
        button1.addActionListener(this);
        contentPane.add(button1);
        
        /* add content pane to frame */
        frame.setContentPane(contentPane);
        
        /* size and then dsplay the frame */
        frame.pack();
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent event) {
        label2.setText("To get to the other side.");
    }
    
    /**
     * create and show the gui
     */
    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        Riddle riddleApp = new Riddle();
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
            }
        });
    }
}