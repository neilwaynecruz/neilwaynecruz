package GUI.PRACTICES.Third;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame implements ActionListener {
    private final JLabel label;
    private int count = 0;

    CounterApp() {
        // Frame setup
        this.setTitle("Counter App");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        // Label
        label = new JLabel("Count: " + count, SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 25));

        // Buttons
        JButton increaseButton = new JButton("Increase");
        increaseButton.setFont(new Font("Roboto", Font.BOLD, 20));
        increaseButton.setFocusable(false);
        increaseButton.setPreferredSize(new Dimension(0, 100));


        JButton decreaseButton = new JButton("Decrease");
        decreaseButton.setFont(new Font("Roboto", Font.BOLD, 20));
        decreaseButton.setFocusable(false);
        decreaseButton.setPreferredSize(new Dimension(0, 100));



        JButton resetButton = new JButton("Reset");
        resetButton.setFont(new Font("Roboto", Font.BOLD, 20));
        resetButton.setFocusable(false);
        resetButton.setPreferredSize(new Dimension(0, 100));


        // Adding action listener
        increaseButton.addActionListener(this);
        decreaseButton.addActionListener(this);
        resetButton.addActionListener(this);

        // Panel for buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3));
        panel.add(increaseButton);
        panel.add(decreaseButton);
        panel.add(resetButton);

        // Adding components
        this.add(label, BorderLayout.CENTER);
        this.add(panel, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Increase")) {
            count++;
        } else if (e.getActionCommand().equals("Decrease")) {
            if (count <= 0)
                count = 0;
            if(count > 0){
                count--;
            }
        }
        else if (e.getActionCommand().equals("Reset")) {
            count = 0;
        }
        label.setText("Count: " + count);
    }

    public static void main(String[] args) {
        new CounterApp();
    }
}