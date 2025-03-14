package GUI.OpenNewWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("Open New Window");

    LaunchPage(){

        button.setBounds(150,150,245,50);
        button.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        button.setFocusable(false);
        button.addActionListener(this);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Open New Window");
        frame.setLayout(null);
        frame.setSize(600,600);
        frame.add(button);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            frame.dispose();
            NewWindow window = new NewWindow();
        }


    }
}
