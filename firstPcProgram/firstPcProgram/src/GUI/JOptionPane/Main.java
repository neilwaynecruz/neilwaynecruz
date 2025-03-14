package GUI.JOptionPane;


import javax.swing.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//      JOptionPane = pop up standard dialog box that prompts user for a value
//                    or informs them of something.


//        JOptionPane.showMessageDialog(null,"This is PLAIN_MESSAGE","Dialog",
//                                        JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is INFORMATION_MESSAGE","Dialog",
//                JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is WARNING_MESSAGE","Dialog",
//                JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is QUESTION_MESSAGE","Dialog",
//                JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is ERROR_MESSAGE","Dialog",
//                JOptionPane.ERROR_MESSAGE);

//       int x = JOptionPane.showConfirmDialog(null,"HUH?","showConfirmDialog"
//                                     ,JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);

//        String name = JOptionPane.showInputDialog("What is your name?");
//        JOptionPane.showMessageDialog(null,name,"showMessageDialog",JOptionPane.INFORMATION_MESSAGE);

        String[] repsonses = {"No,you're awesome","thank you","*yiee*"};
        ImageIcon icon = new ImageIcon(Objects.requireNonNull(Main.class.getResource("Smile.png")));
        int x = JOptionPane.showOptionDialog(null,"You are awesome",
                                "secret message",JOptionPane.YES_NO_CANCEL_OPTION,
                                    JOptionPane.INFORMATION_MESSAGE,icon,repsonses,0);
        System.out.println(x);

        // 1. Message Dialog
        // 2. Confirm Dialog
        // 3. Input Dialog
        // 4. Option Dialog

    }
}
