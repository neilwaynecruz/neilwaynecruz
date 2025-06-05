package GUI.ComboBoxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
//
//    JComboBox = A component that allows the user to choose one of a set of options.
//                A component that combines a button or editable field and a drop-down list.

    // make sure that in JComboBox the items type is reference type, not primitive type. If you want to
    // use primitive types, you can use their wrapper classes (e.g., Integer, Double, Float, etc.)


    String[] animals = {"Dog", "Cat", "Bird", "Fish", "Lizard"};
    JComboBox<String> comboBox = new JComboBox<>(animals);

    public Main() {
        comboBox.addActionListener(this); // Adds an ActionListener to the combo box to handle selection changes
//        comboBox.setEditable(true); // Allows the user to edit the text in the combo box
//        System.out.println(comboBox.getItemCount()); // Prints the number of items in the combo box
//        comboBox.addItem("Hamster"); // Adds a new item to the combo box at the end

//        comboBox.insertItemAt("Hamster", 0); // Inserts a new item at index 0 in the combo box
//        comboBox.setSelectedIndex(0); // Sets the selected item to the first item in the combo box
//        comboBox.removeItem("Fish"); // Removes the item "Fish" from the combo box
//        comboBox.removeItemAt(4); // Removes the item at index 4 from the combo box
//        comboBox.setMaximumRowCount(3); // Sets the maximum number of rows to display in the drop-down list
//        comboBox.removeAllItems(); // Removes all items from the combo box



        setTitle("ComboBoxes"); // Sets the title of the JFrame
        add(comboBox); // Adds the combo box to the JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensures the application exits when the JFrame is closed
        setLayout(new FlowLayout()); // Sets the layout manager for the JFrame to FlowLayout
        pack(); // Sizes the frame so that all its contents are at or above their preferred sizes
        setVisible(true); // Makes the JFrame visible
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox){
            System.out.println("Selected animal: " + comboBox.getSelectedItem());
            System.out.println("Selected animal index: " + comboBox.getSelectedIndex());
        }
    }
    public static void main(String[] args) {
        new Main();
    }

}
