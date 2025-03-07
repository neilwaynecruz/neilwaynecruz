package JavaProgrammingAct.JOPTIONPANE;

import javax.swing.*;

public class TransmutedGrade2 {
    public static void main(String[] args) {
        double tg = 0.0;
        double eq = 0.0;
        int numItems;
        double score;

        try {
            score = Double.parseDouble(JOptionPane.showInputDialog("Enter your score: "));
            numItems = Integer.parseInt(JOptionPane.showInputDialog("Enter number of items: "));

            if (numItems <= 0) {
                JOptionPane.showMessageDialog(null, "Number of items must be greater than zero.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            tg = (score * 50.0) / numItems + 50;
            eq = getEquivalentGrade(tg);

            JOptionPane.showMessageDialog(null,
                    String.format("Transmuted grade is %.2f\nEquivalent grade is %.2f", tg, eq),
                    "Grade Result", JOptionPane.PLAIN_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter numerical values.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An unexpected error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static double getEquivalentGrade(double tg) {
        if (tg >= 97) return 1.00;
        if (tg >= 94) return 1.25;
        if (tg >= 91) return 1.50;
        if (tg >= 88) return 1.75;
        if (tg >= 85) return 2.00;
        if (tg >= 82) return 2.25;
        if (tg >= 79) return 2.50;
        if (tg >= 76) return 2.75;
        if (tg >= 74) return 3.00; // Merged 75 and 74 cases
        if (tg >= 72) return 3.50;
        if (tg >= 70) return 3.75;
        if (tg >= 65) return 4.00;
        if (tg >= 60) return 4.25;
        if (tg >= 58) return 4.50;
        return 5.00;
    }
}
