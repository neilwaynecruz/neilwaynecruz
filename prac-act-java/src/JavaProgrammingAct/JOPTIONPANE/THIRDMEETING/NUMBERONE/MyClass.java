package JavaProgrammingAct.JOPTIONPANE.THIRDMEETING.NUMBERONE;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class MyClass extends MyMethods {
    public static void main(String[] args) {
        
        // find the high and low values

        JTextArea ta = new JTextArea();
        int[] arr1 = new int[5];

        for(int i = 0; i < arr1.length; i++){
            arr1[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number " + (i + 1) + ":", "Input", JOptionPane.INFORMATION_MESSAGE));
        }

        int low = getLow(arr1);
        int high = getHigh(arr1);

        ta.append("Lowest number is: " + low + "\n");
        ta.append("Highest number is: " + high + "\n");
        JOptionPane.showMessageDialog(null, ta, "Output", JOptionPane.INFORMATION_MESSAGE);
    }
}