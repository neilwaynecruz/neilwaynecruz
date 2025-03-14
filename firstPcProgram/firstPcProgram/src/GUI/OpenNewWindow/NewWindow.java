package GUI.OpenNewWindow;

import javax.swing.*;
import java.awt.*;

public class NewWindow {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("HELLO BRO!");

    NewWindow(){

        label.setBounds(0,0,245,50);
        label.setFont(new Font("null",Font.BOLD,30));


        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Open New Window");
        frame.setLayout(null);
        frame.setSize(600,600);
        frame.setVisible(true);

    }

}
