package JavaProgrammingAct.JOPTIONPANE;

import javax.swing.*;

public class InputDialog {
    public static void main(String[] args) {

        // String name;
        // int age;
        String message = "";


//        name = JOptionPane.showInputDialog(null,"Enter your name: ", "Input Dialog box", JOptionPane.QUESTION_MESSAGE);
//        age = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age: ",
//                                                      "Input Dialog box", JOptionPane.QUESTION_MESSAGE));
//
//        JOptionPane.showMessageDialog(null, "Hello " + name + "\nYou are " + age + " years old"
//                                      ,"Show Dialog box", JOptionPane.INFORMATION_MESSAGE);

        for (int i = 1; i <= 5; i++) {
            message += "\nNumber generated is " + i;
        }
//        JOptionPane.showMessageDialog(null, message, "Show Dialog box", JOptionPane.INFORMATION_MESSAGE);

        JTextArea textArea = new JTextArea();
        textArea.setText("Generating number using for loop\n");
        textArea.append(message);
        JOptionPane.showMessageDialog(null, textArea, "Show Dialog box", JOptionPane.INFORMATION_MESSAGE);

    }
}
