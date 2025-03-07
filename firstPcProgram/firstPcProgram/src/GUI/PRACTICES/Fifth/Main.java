package GUI.PRACTICES.Fifth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    private JTextField userField;
    private JPasswordField passField;
    private JLabel messageLabel;

    Main() {
        // Frame setup
        this.setTitle("Login Form");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(4, 1));

        // Username
        userField = new JTextField();
        passField = new JPasswordField();
        messageLabel = new JLabel("", SwingConstants.CENTER);

        // Button
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(this);

        // Panel for input fields
        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.add(new JLabel("Username: "));
        panel.add(userField);
        panel.add(new JLabel("Password: "));
        panel.add(passField);

        // Adding components
        this.add(panel);
        this.add(loginButton);
        this.add(messageLabel);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = userField.getText();
        String password = new String(passField.getPassword());

        if (username.equals("admin") && password.equals("1234")) {
            messageLabel.setText("Login Successful!");
            messageLabel.setForeground(Color.GREEN);
        } else {
            messageLabel.setText("Invalid Credentials");
            messageLabel.setForeground(Color.RED);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
