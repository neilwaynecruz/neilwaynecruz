package GUI.CheckBoxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JCheckBox checkBox;
    ImageIcon xIcon;
    ImageIcon checkIcon;

    MyFrame(){
        this.setTitle("CheckBoxes");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        xIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource("X.png")));
        checkIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource("Check.png")));


        button = new JButton("Submit");
        button.addActionListener(this);

        //for JCheckBox
        checkBox = new JCheckBox();
        checkBox.setText("POGI BA KO TOL?");
        checkBox.setFocusable(Boolean.FALSE);
        checkBox.setFont(new Font("Serif", Font.BOLD, 38));
        checkBox.setForeground(new Color(171, 67, 67));
        checkBox.setSelected(false);
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(checkIcon);

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){

            if(checkBox.isSelected()){
                System.out.println("OO TOL POGI KA!!");
            }
            else{
                System.out.println("EWAN KO SAYO TOL!!");
            }
        }

    }
}
