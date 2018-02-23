/*
 * PhotoAlbum.java
 * view an album of photos
 * by christopher mccauley
 */

package photoalbum;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PhotoAlbum implements ActionListener{
    JFrame frame;
    JPanel contentPane, photoPane;
    JButton nextPhoto;
    JLabel photo;
    String[] photoName;
    int clickCount;
    
    /**
     * constructor
     * pre: none
     * post: gui is constructed
     */
    public PhotoAlbum() {
        photoName = new String[] {"grayangel.jpg", "scorpionfish.jpg", 
            "sponges.jpg", "starfish.jpg"};
        clickCount = 0;
        
        frame = new JFrame("PhotoAlbum");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        contentPane.setBackground(Color.white);
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
        
        photoPane = new JPanel();
        photoPane.setPreferredSize(new Dimension(400, 300));
        photoPane.setBackground(Color.white);
        
        photo = new JLabel(new ImageIcon(photoName[0]));
        photo.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        photoPane.add(photo);
        contentPane.add(photoPane);
        
        nextPhoto = new JButton("Next");
        nextPhoto.setAlignmentX(JButton.CENTER_ALIGNMENT);
        nextPhoto.addActionListener(this);
        contentPane.add(nextPhoto);
        
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
        if (clickCount == 3) {
            clickCount = 0;
        } else {
            clickCount += 1;
        }
        photo.setIcon(new ImageIcon(photoName[clickCount]));
    }
    
    /**
     * create and display gui object
     * pre: none
     * post: gui is displayed
     */
    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        PhotoAlbum rollGUI = new PhotoAlbum();
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
            }
        });
    }
}