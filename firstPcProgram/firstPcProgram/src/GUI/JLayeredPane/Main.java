package GUI.JLayeredPane;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

//        JLayeredPane = Swing container that provides a
//                       third dimension for positioning components

//                       ex. depth, Z-index


        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(150,150,250,250);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.BLUE);
        label2.setBounds(200,200,250,250);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.MAGENTA);
        label3.setBounds(250,250,250,250);



        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,800,800);
        layeredPane.add(label1,Integer.valueOf(1));
        layeredPane.add(label2,Integer.valueOf(2));
        layeredPane.add(label3,Integer.valueOf(3));


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setTitle("JLayeredPane");
        frame.setLayout(null);


        frame.add(layeredPane);
        frame.setVisible(true);

    }
}
