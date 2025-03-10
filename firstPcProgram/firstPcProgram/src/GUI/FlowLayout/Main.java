package GUI.FlowLayout;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Layout Manager = Defines the natural layout for components within a container

        //Flow layout = Places components in a row,sized at their preferred size.
        //              if the horizontal space in the container is too small,
        //              theFlowLayout class uses the next available row.


        JFrame frame = new JFrame("FlowLayout");
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));


         JPanel panel = new JPanel();
         panel.setPreferredSize(new DimensionUIResource(350,350));
         panel.setBackground(Color.LIGHT_GRAY);
         panel.setLayout(new FlowLayout());


        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));
        panel.add(new JButton("Button 5"));
        panel.add(new JButton("Button 6"));
        panel.add(new JButton("Button 7"));
        panel.add(new JButton("Button 8"));
        panel.add(new JButton("Button 9"));




        frame.add(panel);
        frame.setVisible(true);









    }

}
