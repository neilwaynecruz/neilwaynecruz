package JavaProgrammingAct.JOPTIONPANE.INHERITANCE;

import javax.swing.*;

public class Functions {
//    public static void main(String[] args) {

//        for func1
//        func1();
//
//        for func2
//        int x = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number:","Input",JOptionPane.QUESTION_MESSAGE));
//        func2(x);
//
//        for func3
//        int x = func3();
//        if(x % 2 == 0){
//            JOptionPane.showMessageDialog(null,"NUMBER IS EVEN","OUTPUT",JOptionPane.INFORMATION_MESSAGE);
//        }
//        else{
//            JOptionPane.showMessageDialog(null,"NUMBER IS ODD","OUTPUT",JOptionPane.INFORMATION_MESSAGE);
//        }
//
//            for func4
//    int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number:","Input",JOptionPane.QUESTION_MESSAGE));
//        int x = func4(num);
//
//        if(func4(num) % 2 == 0){
//        JOptionPane.showMessageDialog(null,"NUMBER IS EVEN","OUTPUT",JOptionPane.INFORMATION_MESSAGE);
//    }
//        else{
//        JOptionPane.showMessageDialog(null,"NUMBER IS ODD","OUTPUT",JOptionPane.INFORMATION_MESSAGE);
//    }
//
//}

// does not return and not accepting any value, function 1
    public static void func1() {
        while(true) {

            int x = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number:","Input",JOptionPane.QUESTION_MESSAGE));

            if(x % 2 == 0){
                JOptionPane.showMessageDialog(null,"NUMBER IS EVEN","OUTPUT",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null,"NUMBER IS ODD","OUTPUT",JOptionPane.INFORMATION_MESSAGE);
            }

            int response = JOptionPane.showConfirmDialog(null, "CONTINUE?","OUTPUT",JOptionPane.YES_NO_CANCEL_OPTION);

            if(response == JOptionPane.NO_OPTION || response == JOptionPane.CANCEL_OPTION || response == JOptionPane.CLOSED_OPTION){
                break;
            }
        }

    }

    // function 2
    public static void func2(int x){
        if(x % 2 == 0){
            JOptionPane.showMessageDialog(null,"NUMBER IS EVEN","OUTPUT",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"NUMBER IS ODD","OUTPUT",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // with return but does not accept any value, function 3
    public static int func3(){
        return Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number:","Input",JOptionPane.QUESTION_MESSAGE));
    }

    // for function 4
    public static int func4(int x){
        if(x%2==0){
            return x;
        }
        else{
            return 1;
        }
    }

    public static void tg(int score, int items){
        int tg = score * 50 / items + 50;
        System.out.println(("TG = " + tg));
    }

}

