package GUI.KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyListener extends JFrame implements java.awt.event.KeyListener {


    ImageIcon icon = new ImageIcon("src/GUI/KeyListener/resized-rocket.png");
    JLabel label = new JLabel("");

    KeyListener(){

        label.setBounds(0,0,350, 350);
        label.setIcon(icon);

        add(label);
        addKeyListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(759,750);
        setLayout(null);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
//        KeyTyped - Invoked when a key is typed. Uses KeyChar, char output
        switch(e.getKeyChar()){
            case 'a' -> label.setLocation(label.getX() - 10,label.getY());
            case 'd' -> label.setLocation(label.getX() + 10,label.getY());
            case 'w' -> label.setLocation(label.getX(),label.getY()-10);
            case 's' -> label.setLocation(label.getX(),label.getY()+10);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
//        keyPressed - Invoked when a physical key is pressed down. Uses KeyCode, int output

            switch(e.getKeyCode()){
            case 37 -> label.setLocation(label.getX() - 10,label.getY()); // left arrow key
            case 39 -> label.setLocation(label.getX() + 10,label.getY()); // right arrow key
            case 38 -> label.setLocation(label.getX(),label.getY()-10);   // upp arrow key
            case 40 -> label.setLocation(label.getX(),label.getY()+10);   // down arrow key
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        keyReleased - called when the button is released

        System.out.println("The key code is: " + e.getKeyCode());
        System.out.println("The key char is: " + e.getKeyChar());

    }

    public static void main(String[] args) {
        new KeyListener();
    }
}
