/*
 * Roll.java
 * roll 2d6
 * by christopher mccauley
 */

package roll;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class Roll implements ActionListener{
    JFrame frame;
    JPanel contentPane;
    JButton rollDie;
    JLabel[] dieFace = new JLabel[2];
    
    /**
     * constructor
     * pre: none
     * post: gui is constructed
     */
    public Roll() {
        frame = new JFrame("Roll");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPane.setBackground(Color.white);
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
        
        dieFace[0] = new JLabel(new ImageIcon("die3.gif"));
        dieFace[0].setAlignmentX(JLabel.CENTER_ALIGNMENT);
        dieFace[0].setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
        contentPane.add(dieFace[0]);
        
        dieFace[1] = new JLabel(new ImageIcon("die3.gif"));
        dieFace[1].setAlignmentX(JLabel.CENTER_ALIGNMENT);
        dieFace[1].setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
        contentPane.add(dieFace[1]);
        
        rollDie = new JButton("Roll Die");
        rollDie.setAlignmentX(JButton.CENTER_ALIGNMENT);
        rollDie.addActionListener(this);
        contentPane.add(rollDie);
        
        frame.setContentPane(contentPane);
        frame.pack();
        frame.setVisible(true);
    }
    
    /**
     * event listener
     * pre: button is clicked
     * post: icons are changed
     */
    public void actionPerformed(ActionEvent event) {
        int newRoll;
        
        for (int i = 0; i < 2; i++) {
            newRoll = (int)(6 * Math.random() + 1);
            if (newRoll == 1) {
                dieFace[i].setIcon(new ImageIcon("die1.gif"));
            } else if (newRoll == 2) {
                dieFace[i].setIcon(new ImageIcon("die2.gif"));
            } else if (newRoll == 3) {
                dieFace[i].setIcon(new ImageIcon("die3.gif"));
            } else if (newRoll == 4) {
                dieFace[i].setIcon(new ImageIcon("die4.gif"));
            } else if (newRoll == 5) {
                dieFace[i].setIcon(new ImageIcon("die5.gif"));
            } else if (newRoll == 6) {
                dieFace[i].setIcon(new ImageIcon("die6.gif"));
            }
        }
    }
    
    /**
     * create and display gui object
     * pre: none
     * post: gui is displayed
     */
    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        Roll rollGUI = new Roll();
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
            }
        });
    }
}