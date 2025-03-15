package JavaProgrammingAct.JOPTIONPANE;

import javax.swing.*;

public class ACT1 {
    public static void main(String[] args) {
        JTextArea textArea = new JTextArea();
        int choice = 0;
        String warning = "Score can't exceed No. of items. Please enter again.";

        while (choice == 0) {
            textArea.setText("");

            double score1, score2;
            int no_items1, no_items2;

            // Input for Quiz 1 (repeat if invalid)
            while (true) {
                score1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Score: ", "QUIZ 1", JOptionPane.QUESTION_MESSAGE));
                no_items1 = Integer.parseInt(JOptionPane.showInputDialog(null, "No of items: ", "QUIZ 1", JOptionPane.QUESTION_MESSAGE));

                if (score1 > no_items1) {
                    JOptionPane.showMessageDialog(null, warning, "WARNING", JOptionPane.ERROR_MESSAGE);
                } else {
                    break; // Valid input, exit loop
                }
            }

            // Input for Quiz 2 (repeat if invalid)
            while (true) {
                score2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Score: ", "QUIZ 2", JOptionPane.QUESTION_MESSAGE));
                no_items2 = Integer.parseInt(JOptionPane.showInputDialog(null, "No of items: ", "QUIZ 2", JOptionPane.QUESTION_MESSAGE));

                if (score2 > no_items2) {
                    JOptionPane.showMessageDialog(null, warning, "WARNING", JOptionPane.ERROR_MESSAGE);
                } else {
                    break; // Valid input, exit loop
                }
            }

            // Calculate TG Average and Percentage
            double tg = ((score1 + score2) / (no_items1 + no_items2)) * 50 + 50;
            double ave = grades(tg);
            double percentage = ave * 0.35;

            // Output Results
            String q_ave = String.format("QUIZ AVERAGE: %.2f \n", ave);
            String s_percentage = "35% = " + String.format("%.2f", percentage);

            textArea.append(q_ave);
            textArea.append(s_percentage);
            JOptionPane.showMessageDialog(null, textArea, "OUTPUT", JOptionPane.INFORMATION_MESSAGE);

            // Ask if the user wants to continue (Yes = 0, No = 1, Cancel = 2)
            choice = JOptionPane.showConfirmDialog(null, "CONTINUE?", "CONTINUE?", JOptionPane.YES_NO_CANCEL_OPTION);

            if (choice == JOptionPane.NO_OPTION || choice == JOptionPane.CANCEL_OPTION || choice == -1) {
                break; // Exit the loop if "No" or "Cancel" is chosen
            }
        }
    }
    // Method to calculate equivalent grades
    static double grades(double tg) {
        if (tg >= 97) return 1.00;
        if (tg >= 94) return 1.25;
        if (tg >= 91) return 1.50;
        if (tg >= 88) return 1.75;
        if (tg >= 85) return 2.00;
        if (tg >= 82) return 2.25;
        if (tg >= 79) return 2.50;
        if (tg >= 76) return 2.75;
        if (tg == 75) return 3.00;
        if (tg == 74) return 3.25;
        if (tg >= 72) return 3.50;
        if (tg >= 70) return 3.75;
        if (tg >= 65) return 4.00;
        if (tg >= 60) return 4.25;
        if (tg >= 58) return 4.50;
        return 5.00;
    }
}
