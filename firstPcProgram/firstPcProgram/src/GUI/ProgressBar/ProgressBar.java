package GUI.ProgressBar;

import javax.swing.*;
import java.awt.*;

public class ProgressBar extends JFrame{

    JProgressBar progrBar = new JProgressBar(0,200);

    public ProgressBar() {


        progrBar.setBounds(0,0,420,50);
        progrBar.setStringPainted(true); // adds percentage in our progress bar
        progrBar.setFont(new Font("Montserrat",Font.BOLD,30));
        progrBar.setForeground(new Color(255, 0, 0));
        progrBar.setIndeterminate(true);
        progrBar.setBackground(Color.BLACK);

        add(progrBar);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // now layout so we need set bounds
        setSize(420,420);
        setVisible(true);

        fill();
    }

    public void fill() {
        int counter = progrBar.getMaximum();
        while(counter > 0){
            progrBar.setValue(counter);
            try{
                Thread.sleep(350);
            }
            catch(Exception e){
                System.out.println("Error in progressBar");
            }
            counter -= 5;
        }

        progrBar.setString("Done!! :))");
    }

    public static void main(String[] args) {

        // progress bar is a GUI component that visually represents the progress of a task
        // It is a visual aid/ indicator that shows how much of a task has been completed

        ProgressBar progressBar = new ProgressBar();

    }
}
