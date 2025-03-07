package GUI.PRACTICES.First;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon(Objects.requireNonNull(Main.class.getResource("Reaction dog face meme.png")));
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(new Color(0x343232), 35);


        // for label
        label.setText("THE FUCK!!");
        label.setIcon(image);
        label.setFont(new Font("MV Boli", Font.BOLD, 40));
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setForeground(new Color(175, 1, 26));
        label.setIconTextGap(-25);
        label.setBackground(new Color(0xC19B58));
        label.setOpaque(true);
        label.setBorder(border);
        label.setBounds(440,20,1000,1000);



        //for frame

        frame.setTitle("My Practice Fram and Labels");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);
        frame.getContentPane().setBackground(new Color(0x723939));
        frame.setIconImage(new ImageIcon(Objects.requireNonNull(Main.class.getResource("—Pngtree—java programming icon_6044136.png"))).getImage());
        frame.add(label);
        frame.setLayout(null);


        frame.setVisible(true);

    }

}
