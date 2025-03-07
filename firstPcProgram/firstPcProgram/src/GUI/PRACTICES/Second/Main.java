package GUI.PRACTICES.Second;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon(Objects.requireNonNull(Main.class.getResource("TheFuck.jpg")));

        // for labels
        JLabel label = new JLabel();
        label.setText("Hello, NIGGAS!!");
        label.setFont(new Font("MV Boli", Font.PLAIN, 100));
        label.setForeground(new Color(221, 16, 60));
        label.setBounds(900, 450, 800, 100);

        JLabel label2 = new JLabel();
        label2.setIcon(icon);
        label2.setBounds(420, 270, 435, 490);


        // for panels
        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(0, 0, 0, 207));
        panel1.setBounds(0, 0, 1920, 80);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(0, 0, 0, 207));
        panel2.setBounds(0, 80, 100, 1080);

        JPanel panel3 = new JPanel();
        panel3.setBackground(new Color(0, 0, 0, 207));
        panel3.setBounds(100, 960, 1920, 94);

        JPanel panel4 = new JPanel();
        panel4.setBackground(new Color(0, 0, 0, 207));
        panel4.setBounds(1804, 80, 100, 880);


        // for frames
        JFrame frame = new JFrame();
        frame.setTitle("Practice 2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(84, 153, 228));
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(label);
        frame.add(label2);

        frame.setVisible(true);

    }
}
