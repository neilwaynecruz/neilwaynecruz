package GUI.Sliders;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class Slider extends JFrame implements ChangeListener {

//    JSlider = Gui component that lets the user graphically select a value by sliding a knob along a track

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JLabel label1 = new JLabel();
    JSlider slider;

    public Slider(){

        super("Slider Example");

        panel1.setBounds(0,0,90,200);
        panel2.setBounds(0,220,120,200);


        slider = new JSlider(0,100,50); // min, max, initial value
        slider.setPreferredSize(new Dimension(200,200));

        slider.setPaintTicks(true); // Show tick marks, this are the small lines on the slider
        slider.setMinorTickSpacing(5); // Spacing between minor ticks (regular/smaller ticks)

        slider.setPaintTrack(true); // Show the track. this is the line bar that the slider moves along
        slider.setMajorTickSpacing(25); // Spacing between major ticks (larger ticks)
        slider.setFont(new Font("MV Boli", Font.BOLD, 20)); // Set font for the slider
        slider.setPaintLabels(true); // Show labels on the ticks
        slider.setSnapToTicks(true); // Snap the slider to the nearest tick mark
        slider.setOrientation(SwingConstants.VERTICAL);

        slider.addChangeListener(this); // Add a change listener to the slider

        label1.setText("°C = " + slider.getValue());
        label1.setFont(new Font("MV Boli", Font.BOLD, 18));


        panel1.add(slider);
        panel2.add(label1);


        add(panel1);
        add(panel2);
        setSize(110,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }


    @Override
    public void stateChanged(ChangeEvent e){
        if (e.getSource() == slider) {
            label1.setText("°C = " + slider.getValue());
        }
    }


    public static void main(String[] args) {
        Slider slider = new Slider();
    }
}
