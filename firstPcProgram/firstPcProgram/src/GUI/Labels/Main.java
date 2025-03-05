package GUI.Labels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Jlabel = a GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("C:\\mainMasterBranch\\firstPcProgram\\firstPcProgram\\src\\GUI\\Labels\\The 100 Most Important Dog Photos Of All Time.png");
        JFrame frame = new JFrame(); // create a frame
        JLabel label = new JLabel(); //create a label
        Border border = BorderFactory.createLineBorder(new Color(121, 50, 50), 5); // create a border

        // label part
        label.setText("Hi, I'm DOGEEE HEHE!!"); // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of imageicon
        label.setForeground(new Color(107, 218, 91)); // set color of text (font)
        label.setFont(new Font("MV Boli", Font.BOLD, 40)); // set font of text
        label.setIconTextGap(25); // set gap of text to image
        label.setBackground(new Color(0x5979A6)); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border); // set border of label
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label (TOP, CENTER, BOTTOM)
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label (LEFT, CENTER, RIGHT)
//        label.setBounds(650, 240, 600, 550); // set x, y position within frame as well as dimensions




        // frame part
        frame.setTitle("Labels"); // Set title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit when you click the x button
//        frame.setLayout(null); // set layout manager
        frame.setSize(1920, 1080); // Set size of frame x, y dimensions
//      frame.getContentPane().setBackground(new Color(29, 85, 141)); // Change color of background
        frame.add(label); // add label to frame
        frame.pack(); // pack components within frame, add components first before packing


        frame.setVisible(true);


    }
}
