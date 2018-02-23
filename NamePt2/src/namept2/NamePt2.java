/*
 * NamePt2.java
 * java gui demo
 * by christopher mccauley
 */

package namept2;

import javax.swing.*;
import java.awt.event.*;

public class NamePt2 implements ActionListener {
    final static String LABEL_TEXT = "Christopher McCauley";
    JFrame frame;
    JPanel contentPane;
    JLabel label;
    JButton button;
    
    public NamePt2() {
        /* create and set up the frame */
        frame = new JFrame("NamePt2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /* create a content pane */
        contentPane = new JPanel();
        
        /* create and add label */
        label = new JLabel(LABEL_TEXT);
        contentPane.add(label);
        
        /* create and add button */
        button = new JButton("Hide");
        button.setActionCommand("Hide");
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
     * pre: action event is hide or show
     * post: clicked button has different text, and label displays message 
     * depending on when the button was clicked
     */
    public void actionPerformed(ActionEvent event) {
        String eventName = event.getActionCommand();
        
        if (eventName.equals("Hide")) {
            label.setText(" ");
            button.setText("Show");
            button.setActionCommand("Show");
        } else {
            label.setText(LABEL_TEXT);
            button.setText("Hide");
            button.setActionCommand("Hide");
        }
    }
    
    /**
     * create and show the gui
     */
    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        NamePt2 myName = new NamePt2();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
            }
        });
    }
}