package JavaProgrammingAct.JOPTIONPANE;

import javax.swing.*;

public class InputDemo {
    public static void main(String[] args) {
        String x = "";
        int age = 0;

        JOptionPane j = new JOptionPane();

        j.showMessageDialog(null, "Sample Dialog", "Dialog box demo", j.PLAIN_MESSAGE);
        x = j.showInputDialog("Enter your name");
        j.showMessageDialog(null, "Hello " + x, "Dialog box demo", j.PLAIN_MESSAGE);
        age = Integer.parseInt(j.showInputDialog("Enter your age"));
        j.showMessageDialog(null, "You are " + age + " years old ", "Dialog box demo", j.PLAIN_MESSAGE);
    }
}
