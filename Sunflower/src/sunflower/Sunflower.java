/*
 * Sunflower.java
 * java gui demo
 * by christopher mccauley
 */

package sunflower;

import javax.swing.*;
import java.awt.event.*;

public class Sunflower implements ActionListener {
    JFrame frame;
    JPanel contentPane;
    JLabel label;
    JButton button1, button2;
    
    public Sunflower() {
        /* create and set up the frame */
        frame = new JFrame("Sunflower");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /* create a content pane */
        contentPane = new JPanel();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        /* create and add label */
        label = new JLabel("by any other name...");
        label.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
        label.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        contentPane.add(label);
        
        /* create and add button1 */
        button1 = new JButton("English");
        button1.setAlignmentX(JButton.CENTER_ALIGNMENT);
        button1.setActionCommand("English");
        button1.addActionListener(this);
        contentPane.add(button1);
        
        /* create and add button2 */
        button2 = new JButton("Latin");
        button2.setAlignmentX(JButton.CENTER_ALIGNMENT);
        button2.setActionCommand("Latin");
        button2.addActionListener(this);
        contentPane.add(button2);
        
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
        
        if (eventName.equals("English")) {
            label.setText("Sunflower");
        } else {
            label.setText("Helianthus");
        }
    }
    
    /**
     * create and show the gui
     */
    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        Sunflower translator = new Sunflower();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
            }
        });
    }
}