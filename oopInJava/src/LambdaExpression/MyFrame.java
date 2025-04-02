package LambdaExpression;

import javax.swing.*;

public class MyFrame extends JFrame {

    JButton button = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    MyFrame(){

        button.setBounds(100,100, 200, 100);
        button.setFocusable(false);
        button.addActionListener(e -> {
            System.out.println("This is a first button");
        });

        button2.setBounds(100, 200, 200, 100);
        button2.setFocusable(false);
        button2.addActionListener(e -> {
            System.out.println("This is a second button");
        });


        this.add(button);
        this.add(button2);
        this.setTitle("My Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);
        this.setVisible(true);
    }
}
