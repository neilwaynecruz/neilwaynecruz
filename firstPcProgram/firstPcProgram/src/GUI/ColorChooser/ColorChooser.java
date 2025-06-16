package GUI.ColorChooser;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ColorChooser extends JFrame implements ActionListener {

    JButton button = new JButton("PICK COLOR");
    JLabel label = new JLabel();

    public ColorChooser() {
        super("Color Chooser");

        label.setBackground(Color.white);
        label.setOpaque(true);
        label.setText("Neil Wayne Cruz");
        label.setFont(new Font("Serif", Font.BOLD, 150));

        button.addActionListener(this);


        add(button);
        add(label);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null,"Pick Color",colorChooser.getColor());
//            label.setForeground(color);
            label.setBackground(color);
        }
    }

    public static void main(String[] args) {
        new ColorChooser();
    }
}
