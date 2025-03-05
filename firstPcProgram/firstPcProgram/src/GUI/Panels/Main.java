package GUI.Panels;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        JPanel = a GUI component that functions as a container to hold other components

        //for image
        ImageIcon icon = new ImageIcon("C:\\mainMasterBranch\\firstPcProgram\\firstPcProgram\\src\\GUI\\Panels\\like.png");

        //LABELS
        JLabel label = new JLabel();
        label.setText("Hello");
        label.setFont(new Font("MV Boli", Font.PLAIN, 50));
        label.setIcon(icon);
        label.setBounds(150, 0, 250, 250);



        //RED PANEL
        JPanel redPanel = new JPanel();
        redPanel.setBackground(new Color(255, 0, 0, 216));
        redPanel.setBounds(0, 0, 270, 270);
        redPanel.setLayout(null);
//        redPanel.add(label);




        //BLUE PANEL
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(new Color(0, 34, 255, 216));
        bluePanel.setBounds(270, 0 ,270, 270);
        bluePanel.setLayout(null);
//        bluePanel.add(label);




        //GREEN PANEL
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(new Color(41, 237, 32, 216));
        greenPanel.setBounds(0, 270, 540, 250);
        greenPanel.setLayout(null);
        greenPanel.add(label);




        //frame
        JFrame frame = new JFrame();
        frame.setTitle("Panels");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.add(redPanel); // for red panel
        frame.add(bluePanel); // for blue panel
        frame.add(greenPanel); // for green panel
    }
}
