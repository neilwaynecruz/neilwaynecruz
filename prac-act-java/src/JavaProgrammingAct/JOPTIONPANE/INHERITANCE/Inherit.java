package JavaProgrammingAct.JOPTIONPANE.INHERITANCE;

import javax.swing.*;

public class Inherit extends Functions{

    public static void main(String[] args) {
        tg(25,50);
//        func1();
//        func2(2);
//        if (func3() % 2 == 0){
//            JOptionPane.showMessageDialog(null,"NUMBER IS EVEN","OUTPUT",JOptionPane.INFORMATION_MESSAGE);
//        }
//        else{
//            JOptionPane.showMessageDialog(null,"NUMBER IS ODD","OUTPUT",JOptionPane.INFORMATION_MESSAGE);
//        }

        int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number:","Input",JOptionPane.QUESTION_MESSAGE));
        if (func4(num) % 2 == 0){
            JOptionPane.showMessageDialog(null,"NUMBER IS EVEN","OUTPUT",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"NUMBER IS ODD","OUTPUT",JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
