package GUI.GridLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

//         Layout Manager = Defines the natural layout for components within a container

//         GridLayout     =   places components  in a grid of cells.
//                            each component takes all the available spaces within its cell,
//                            and each cell is the same size


        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("GridLayout");
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setSize(800,800);
        frame.setLayout(new GridLayout(2,5,5,5));


        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("10"));


        frame.setVisible(true);

    }
}
