package JavaProgrammingAct.JOPTIONPANE.SECONDMEETING;

import javax.swing.*;

public class ACT2 {
    public static void main(String[] args) {

        // FIBONACCI SERIES

        JTextArea textArea = new JTextArea();

        do {
            textArea.setText("");
            int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a 1st number:","1st number",JOptionPane.QUESTION_MESSAGE));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a 2nd number:","2nd number",JOptionPane.QUESTION_MESSAGE));

            int nextTerm = num2 + num1;
            int prevTerm = num2;

            textArea.append("DISPLAY 1ST 6 NUMBERS IN THE FIBONACCI SERIES\n\n");
            textArea.append(String.valueOf(num1) + " " + num2 + " ");

            for(int i = 3; i<7; i++){
                textArea.append(String.valueOf(nextTerm) + " ");
                int temp = nextTerm;
                nextTerm = nextTerm + prevTerm;
                prevTerm = temp;
            }

            JOptionPane.showMessageDialog(null,textArea,"OUTPUT",JOptionPane.INFORMATION_MESSAGE);

            int response = JOptionPane.showConfirmDialog(null,"CONTINUE? [Y/N]","TRY AGAIN?",JOptionPane.YES_NO_CANCEL_OPTION);

            if (response == JOptionPane.NO_OPTION || response == JOptionPane.CANCEL_OPTION || response == JOptionPane.CLOSED_OPTION){
                break;
            }

        }while (true);

    }
}
