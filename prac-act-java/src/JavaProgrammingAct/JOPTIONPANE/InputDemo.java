package JavaProgrammingAct.JOPTIONPANE;

import javax.swing.*;

public class InputDemo {
    public static void main(String[] args) {
        String x = "";
        int age = 0;

        JOptionPane.showMessageDialog(null, "Sample Dialog", "Dialog box demo", JOptionPane.PLAIN_MESSAGE);
        x = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + x, "Dialog box demo", JOptionPane.PLAIN_MESSAGE);
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old ", "Dialog box demo", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Dialog box demo", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
    }
}
