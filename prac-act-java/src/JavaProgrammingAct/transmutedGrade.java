package JavaProgrammingAct;

import javax.swing.*;

public class transmutedGrade {
    public static void main(String[] args) {

        double tg = 0.0;
        int numItems = 0;
        double score = 0.0;
        double eq = 0.0;

        JOptionPane j = new JOptionPane();

        score = Double.parseDouble(j.showInputDialog("Enter your score: "));
        numItems = Integer.parseInt(j.showInputDialog("Enter number of items: "));

        tg = score * 50 / numItems + 50;


        if(tg >= 97){
            eq = 1.00;
        }else if(tg >= 94){
            eq = 1.25;
        }else if(tg >= 91){
            eq = 1.50;
        }else if(tg >= 88){
            eq = 1.75;
        } else if(tg >= 85){
            eq = 2.00;
        } else if(tg >= 82){
            eq = 2.25;
        } else if(tg >= 79){
            eq = 2.50;
        } else if(tg >= 76){
            eq = 2.75;
        } else if(tg == 75){
            eq = 3.00;
        } else if(tg == 74){
            eq = 3.25;
        } else if(tg >= 72){
            eq = 3.50;
        } else if(tg >= 70){
            eq = 3.75;
        } else if(tg >= 65){
            eq = 4.00;
        } else if(tg >= 60){
            eq = 4.25;
        } else if(tg >= 58){
            eq = 4.50;
        } else{
            eq = 5.00;
        }

        System.out.printf("Transmuted grade is %.2f\n", tg);
        System.out.printf("Equivalent grade is %.2f\n", eq);

    }
}
