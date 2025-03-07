package GUI.Frames;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;

//JFrame frame = new JFrame(); // Create a frame
public class MyFrame extends JFrame {

    MyFrame(){

        this.setTitle("My First Frame");                       // Set title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // exit when you click the x button
        this.setResizable(false);                          // Prevent frame from being resized
        this.setSize(500, 500);                // Set size of frame x, y dimensions

        ImageIcon image = new ImageIcon(Objects.requireNonNull(getClass().getResource("img.png")));

        // Create an ImageIcon
        this.setIconImage(image.getImage());               // Change icon of frame


        this.getContentPane().setBackground(new Color(29, 85, 141)); // Change color of background

        this.setVisible(true); // Make frame visible

    }

}
