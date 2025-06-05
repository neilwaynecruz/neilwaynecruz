package GUI.RadioButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener{
    JRadioButton rdbPizza = new JRadioButton("Pizza");
    JRadioButton rdbHamburger = new JRadioButton("Hamburger");
    JRadioButton rdbHotdog = new JRadioButton("Hotdog");
    ButtonGroup buttonGroup = new ButtonGroup();

    ImageIcon iconPizza = new ImageIcon("firstPcProgram/src/GUI/RadioButtons/pizza.jpg");
    ImageIcon iconHamburger = new ImageIcon("firstPcProgram/src/GUI/RadioButtons/hamburger.jpg");
    ImageIcon iconHotdog = new ImageIcon("firstPcProgram/src/GUI/RadioButtons/hot-dog.jpg");

    public MyFrame() {


        buttonGroup.add(rdbPizza);
        buttonGroup.add(rdbHamburger);
        buttonGroup.add(rdbHotdog);

        rdbPizza.setFont(new Font("Comic sans MS", Font.BOLD ,20)); rdbPizza.setForeground(new Color(205, 111, 50));
        rdbHamburger.setFont(new Font("Comic sans MS", Font.BOLD ,20)); rdbHamburger.setForeground(new Color(184, 163, 73));
        rdbHotdog.setFont(new Font("Comic sans MS", Font.BOLD ,20)); rdbHotdog.setForeground(new Color(200, 66, 66));

        rdbPizza.setIcon(iconPizza);
        rdbHamburger.setIcon(iconHamburger);
        rdbHotdog.setIcon(iconHotdog);

        rdbPizza.addActionListener(this);
        rdbHamburger.addActionListener(this);
        rdbHotdog.addActionListener(this);
        rdbHotdog.setSelected(true);


        add(rdbPizza); rdbPizza.setFocusable(false);
        add(rdbHamburger); rdbHamburger.setFocusable(false);
        add(rdbHotdog); rdbHotdog.setFocusable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("My Radio Buttons");
        setSize(400, 300);
        setLayout(new FlowLayout());
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(rdbPizza.isSelected()){
            JOptionPane.showMessageDialog(this, "You selected Pizza", "Pizza", JOptionPane.INFORMATION_MESSAGE, iconPizza);
        }
        if(rdbHamburger.isSelected()){
            JOptionPane.showMessageDialog(this, "You selected Hamburger", "Hamburger", JOptionPane.INFORMATION_MESSAGE, iconHamburger);
        }
        if(rdbHotdog.isSelected()){
            JOptionPane.showMessageDialog(this, "You selected Hotdog", "Hotdog", JOptionPane.INFORMATION_MESSAGE, iconHotdog);
        }
    }

}


