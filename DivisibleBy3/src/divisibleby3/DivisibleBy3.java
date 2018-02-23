/*
 * DivisibleBy3.java
 * determines if input is divisible by 3
 * by christopher mccauley
 */

package divisibleby3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DivisibleBy3 implements ActionListener{
    JFrame frame;
    JPanel contentPane;
    JLabel inputBoxLbl, answerLbl;
    JButton answerBtn;
    JTextField inputBox;
    
    /**
     * gui constructor
     * pre: none
     * post: gui is constructed
     */
    public DivisibleBy3() {
        frame = new JFrame("Divisible by 3?");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(2, 2, 10, 10));
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        inputBoxLbl = new JLabel("Enter an integer:");
        inputBoxLbl.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        contentPane.add(inputBoxLbl);

        inputBox = new JTextField(15);
        inputBox.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        contentPane.add(inputBox);

        answerBtn = new JButton("Check");
        answerBtn.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        answerBtn.addActionListener(this);
        contentPane.add(answerBtn);

        answerLbl = new JLabel(" ", answerLbl.CENTER);
        answerLbl.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        contentPane.add(answerLbl);

        frame.setContentPane(contentPane);
        frame.pack();
        frame.setVisible(true);
    }
    
    /**
     * button click event listener
     * pre: none
     * post: answerLbl is updated
     */
    public void actionPerformed(ActionEvent event) {
        int userInput = Integer.parseInt(inputBox.getText());
        
        if (userInput == 0 || userInput % 3 != 0) {
            answerLbl.setText("Number is not divisible by 3.");
        } else {
            answerLbl.setText("Number is divisible by 3.");
        }
    }
    
    /**
     * run gui
     * pre: none
     * post: displays gui
     */
    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        DivisibleBy3 threesApp = new DivisibleBy3();
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
            }
        });
    }
}