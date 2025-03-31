package JavaProgrammingAct.JOPTIONPANE.THIRDMEETING.NUMBERTHREE;

import javax.swing.*;

public class MyClass extends MyMethods{
    public static void main(String[] args) {

        JTextArea ta = new JTextArea();


        // input for quiz 1 and 2
        double q1 = Double.parseDouble(JOptionPane.showInputDialog(null,"QUIZ 1: ","INPUT",JOptionPane.QUESTION_MESSAGE));
        double q2 = Double.parseDouble(JOptionPane.showInputDialog(null,"QUIZ 2: ","INPUT",JOptionPane.QUESTION_MESSAGE));


        double lab1 = Double.parseDouble(JOptionPane.showInputDialog(null,"LAB 1: ","INPUT",JOptionPane.QUESTION_MESSAGE));
        double lab2 = Double.parseDouble(JOptionPane.showInputDialog(null,"LAB 2: ","INPUT",JOptionPane.QUESTION_MESSAGE));
        double lab3 = Double.parseDouble(JOptionPane.showInputDialog(null,"LAB 3: ","INPUT",JOptionPane.QUESTION_MESSAGE));

        double MTEQ = Double.parseDouble(JOptionPane.showInputDialog(null,"MIDTERM EQ: ","INPUT",JOptionPane.QUESTION_MESSAGE));

        // to get average for quiz and lab
        double Q_ave = QuizAve(q1,q2);
        double L_ave = LabAve(lab1, lab2, lab3);
        double MT = MT(Q_ave, L_ave, MTEQ);

        ta.setText("QUIZ AVERAGE: " + String.format("%.2f", Q_ave) + "\n");
        ta.append("LAB AVERAGE: " + String.format("%.2f", L_ave) + "\n");
        ta.append("MIDTERM GRADE: " + String.format("%.2f", MT) + "\n");

        JOptionPane.showMessageDialog(null,ta,"OUTPUT",JOptionPane.INFORMATION_MESSAGE);
    }
}
