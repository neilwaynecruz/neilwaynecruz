package JavaProgrammingAct.JOPTIONPANE.THIRDMEETING;

import javax.swing.*;

public class MyCLASS extends MyMethods {
    public static void main(String[] args) {
        JTextArea ta = new JTextArea();

        // input
        double score = Double.parseDouble(JOptionPane.showInputDialog(null, "INPUT SCORE:", "INPUT", JOptionPane.QUESTION_MESSAGE));
        int no_items = Integer.parseInt(JOptionPane.showInputDialog(null, "INPUT ITEMS:", "INPUT", JOptionPane.QUESTION_MESSAGE));

        //compute tg and return the value to RTG, TG method accepts score and no of items
        double RTG = TG(score, no_items);

        //compute Equivalent and return the value to eq, EQ method accepts the RTG which is the value of tg method return
        double eq = EQ(RTG);

        // output
        ta.append(String.format("Transmuted Grade: %.2f", RTG) + "\n");
        ta.append(String.format("Equivalent Grade: %.2f", eq) + "\n");
        JOptionPane.showMessageDialog(null, ta, "OUTPUT", JOptionPane.INFORMATION_MESSAGE);

    }
}


