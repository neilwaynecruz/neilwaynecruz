package JavaProgrammingAct.JOPTIONPANE.SECONDMEETING;

import javax.swing.*;

public class ACT1 {
    public static void main(String[] args) {

        //GRADING SYSTEM

        JTextArea textArea = new JTextArea();
        do{
            textArea.setText("");
            String grading_system = "";
            double ave = 0.00;
            double q1,q2,q3,q4 = 0.00;

            while (true) {
                try {
                    q1 = Float.parseFloat(JOptionPane.showInputDialog(null, "FIRST QUARTER: ", "Input", JOptionPane.QUESTION_MESSAGE));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input! Please enter a numeric value.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            while (true) {
                try {
                    q2 = Float.parseFloat(JOptionPane.showInputDialog(null, "SECOND QUARTER: ", "Input", JOptionPane.QUESTION_MESSAGE));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input! Please enter a numeric value.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            while (true) {
                try {
                    q3 = Float.parseFloat(JOptionPane.showInputDialog(null, "THIRD QUARTER: ", "Input", JOptionPane.QUESTION_MESSAGE));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input! Please enter a numeric value.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            while (true) {
                try {
                    q4 = Float.parseFloat(JOptionPane.showInputDialog(null, "FOURTH QUARTER: ", "Input", JOptionPane.QUESTION_MESSAGE));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input! Please enter a numeric value.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            while(true) {
                grading_system = String.valueOf(JOptionPane.showInputDialog(null, "GRADING SYSTEM [A-C]:", "Input", JOptionPane.QUESTION_MESSAGE).toUpperCase().charAt(0));

                if (grading_system.equals("A")||grading_system.equals("B")||grading_system.equals("C")){
                    break;
                } else{
                    JOptionPane.showMessageDialog(null, "INVALID GRADING SYSTEM", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            switch (grading_system) {
                case "A" -> {
                    textArea.append("AVERAGING\n");
                    ave = ((q1 + q2 + q3 + q4) / 4);
                }
                case "B" -> {
                    textArea.append("WEIGHTED AVERAGING\n");
                    ave = ((q1 * .2) + (q2 * .2) + (q3 * .2) + (q4 * .4));
                }
                case "C" -> {
                    textArea.append("CUMULATIVE\n");
                    ave = (q4);
                }
            }

            textArea.append("AVERAGE = " + String.format("%.2f", ave));
            JOptionPane.showMessageDialog(null,textArea,"OUTPUT",JOptionPane.INFORMATION_MESSAGE);

            int choice = JOptionPane.showConfirmDialog(null,"CONTINUE [Y/N]?","Input",JOptionPane.YES_NO_CANCEL_OPTION);
            if (choice == JOptionPane.NO_OPTION || choice == JOptionPane.CANCEL_OPTION || choice == JOptionPane.CLOSED_OPTION){
                break;
            }

        }while (true);

    }
}
