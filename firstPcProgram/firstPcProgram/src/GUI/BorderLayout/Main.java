package GUI.BorderLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //Layout manager = Defines the natural layout for components within a container

        // 3 common managers

        // BorderLayout = A BorderLayout places components in five ares. NORTH,SOUTH,EAST,WEST,CENTER
        //                All extra spaces is placed in the center area




        // panel initialisation
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();


        //for panel1
        panel1.setLayout(new BorderLayout());
        panel1.setPreferredSize(new Dimension(100, 100));
        panel1.setBackground(new Color(208, 77, 77));


        //for panel2
        panel2.setLayout(new BorderLayout());
        panel2.setPreferredSize(new Dimension(100, 100));
        panel2.setBackground(new Color(110, 162, 69));


        //for panel3
        panel3.setLayout(new BorderLayout());
        panel3.setPreferredSize(new Dimension(100, 100));
        panel3.setBackground(new Color(72, 195, 163));

        //for panel4
        panel4.setLayout(new BorderLayout());
        panel4.setPreferredSize(new Dimension(100, 100));
        panel4.setBackground(new Color(145, 25, 25));

        //for panel5
        panel5.setLayout(new BorderLayout());
        panel5.setPreferredSize(new Dimension(100, 100));
        panel5.setBackground(new Color(15, 45, 125));



        // -------------------SUB PANELS----------------------------


        // panel initialisation
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        //for panel6
        panel6.setLayout(new BorderLayout());
        panel6.setPreferredSize(new Dimension(50, 50));
        panel6.setBackground(new Color(88, 29, 94));


        //for panel7
        panel7.setLayout(new BorderLayout());
        panel7.setPreferredSize(new Dimension(50, 50));
        panel7.setBackground(new Color(73, 100, 70));


        //for panel8
        panel8.setLayout(new BorderLayout());
        panel8.setPreferredSize(new Dimension(50, 50));
        panel8.setBackground(new Color(81, 76, 144));

        //for panel9
        panel9.setLayout(new BorderLayout());
        panel9.setPreferredSize(new Dimension(50, 50));
        panel9.setBackground(new Color(140, 113, 44));

        //for panel10
        panel10.setLayout(new BorderLayout());
        panel10.setPreferredSize(new Dimension(50, 50));
        panel10.setBackground(new Color(165, 156, 156));

        panel5.add(panel6, BorderLayout.NORTH);
        panel5.add(panel7, BorderLayout.WEST);
        panel5.add(panel8, BorderLayout.EAST);
        panel5.add(panel9, BorderLayout.SOUTH);
        panel5.add(panel10, BorderLayout.CENTER);

        // -------------------SUB PANELS----------------------------



        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("BorderLayout");
        frame.setSize(800,800);
        frame.setLayout(new BorderLayout(20, 20));
        frame.getContentPane().setBackground(new Color(16, 16, 16));
        frame.setVisible(true);
        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.WEST);
        frame.add(panel3,BorderLayout.EAST);
        frame.add(panel4,BorderLayout.SOUTH);
        frame.add(panel5,BorderLayout.CENTER);




    }
}
