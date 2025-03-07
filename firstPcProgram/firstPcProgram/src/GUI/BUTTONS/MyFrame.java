package GUI.BUTTONS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button = new JButton();
    JLabel label = new JLabel();

    MyFrame() {

        ImageIcon icon = new ImageIcon("C:\\mainMasterBranch\\firstPcProgram\\firstPcProgram\\src\\GUI\\BUTTONS\\img.png");
        ImageIcon icon2 = new ImageIcon("C:\\mainMasterBranch\\firstPcProgram\\firstPcProgram\\src\\GUI\\BUTTONS\\shocked.png");

        // for the label
        label.setIcon(icon2);
        label.setBounds(138, 200, 300, 300); // Adjust position and size
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setVisible(false);

        // for the button
        button.setBounds(150, 150, 250, 100); // Adjusted button size
        button.setText("I'm a button");
        button.setForeground(Color.BLACK);
        button.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        button.setBackground(new Color(182, 174, 83, 197));
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.LEFT);
        button.setVerticalTextPosition(JButton.CENTER);
        button.setIconTextGap(10);
        button.setBorder(BorderFactory.createCompoundBorder());
        button.addActionListener(this);
        button.setFocusable(false);

        // for the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(600, 500); // Adjusted frame size
        this.getContentPane().setBackground(new Color(75, 85, 120)); // Fixed RGBA color
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.out.println("Button clicked");
            label.setVisible(!label.isVisible());
        }
    }
}

