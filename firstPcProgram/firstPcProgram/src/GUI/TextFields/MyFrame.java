package GUI.TextFields;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;

    MyFrame() {
        this.setTitle("Text Field Example");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        textField = new JTextField();
        textField.setPreferredSize(new Dimension(300, 50));
        textField.setFont(new Font("Consolas", Font.BOLD, 20));
        textField.setForeground(new Color(55, 241, 38));
        textField.setOpaque(true);
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(new Color(55, 241, 38));
        textField.setText("Username");


        button = new JButton("Submit");
        button.addActionListener(this);

        this.add(textField);
        this.add(button);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println("Welcome, " + textField.getText());
            button.setEnabled(false);
            textField.setEditable(false);
        }
    }
}
