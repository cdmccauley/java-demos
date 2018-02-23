/*
 * MetricConversion.java
 * displays conversion formulas for imperial to metric
 * by christopher mccauley
 */

package metricconversion;

import javax.swing.*;
import java.awt.event.*;

public class MetricConversion implements ActionListener{
    JFrame frame;
    JPanel contentPane;
    JLabel listBoxLbl, formulaLbl;
    JComboBox listBox;
    String inchCentimeter;
    String footMeter;
    String gallonLiter;
    String poundKilogram;
    
    /**
     * gui constructor
     * pre: none
     * post: gui is constructed
     */
    public MetricConversion() {
        inchCentimeter = "inch to centimeter";
        footMeter = "foot to meter";
        gallonLiter = "gallon to liter";
        poundKilogram = "pound to kilogram";
    
        frame = new JFrame("MetricConversion");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = new JPanel();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        listBoxLbl = new JLabel("Select a conversion type:");
        listBoxLbl.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        contentPane.add(listBoxLbl);
        
        String[] menuItems = {inchCentimeter, footMeter, gallonLiter, poundKilogram};
        listBox = new JComboBox(menuItems);
        listBox.addActionListener(this);
        contentPane.add(listBox);

        formulaLbl = new JLabel(" ");
        formulaLbl.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        formulaLbl.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        contentPane.add(formulaLbl);

        frame.setContentPane(contentPane);
        frame.pack();
        frame.setVisible(true);
    }
    
    /**
     * button click event listener
     * pre: none
     * post: formulaLbl is updated
     */
    public void actionPerformed(ActionEvent event) {
        JComboBox actionComboBox = (JComboBox)event.getSource();
        String selection = (String)actionComboBox.getSelectedItem();
        
        if (selection == inchCentimeter) {
            formulaLbl.setText("1 inch = 2.54 centimeters");
        } else if (selection == footMeter) {
            formulaLbl.setText("1 foot = 0.3048 meters");
        } else if (selection == gallonLiter) {
            formulaLbl.setText("1 gallon = 4.5461 liters");
        } else {
            formulaLbl.setText("1 pound = 0.4536 liters");
        }
        frame.pack();
    }
    
    /**
     * run gui
     * pre: none
     * post: displays gui
     */
    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        MetricConversion metricConversionGUI = new MetricConversion();
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
            }
        });
    }
}