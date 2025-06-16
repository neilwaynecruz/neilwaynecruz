package GUI.FileChooser;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class FileChooser extends JFrame implements ActionListener {
    JButton openButton = new JButton("Open File");
    JButton saveButton = new JButton("Save File");

    public FileChooser() {
        openButton.addActionListener(this);
        saveButton.addActionListener(this);

        setLayout(new FlowLayout());
        add(openButton);
        add(saveButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100); // simple window size
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(".")); // current folder

        if (e.getSource() == openButton) {
            int response = fileChooser.showOpenDialog(null);

            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println("Opened: " + file.getAbsolutePath());

                // Optional: Read and print content (simple text files)
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    System.out.println("File content:");
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

        if (e.getSource() == saveButton) {
            int response = fileChooser.showSaveDialog(null);

            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println("Saving to: " + file.getAbsolutePath());

                // Optional: Save sample text to file
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    writer.write("This is a sample text saved to the file.");
                    System.out.println("File saved successfully!");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new FileChooser();
    }
}
