package Programs;

import java.util.*;

public class forLoops {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter how many second/s to countdown: ");
        int sec = scanner.nextInt();

        for (int i = sec; i >= 0; i--){
            System.out.println(i);
            Thread.sleep(700);
        }

        System.out.println("\t\t\t\tTHE END\n\n");
        scanner.close();
    }
    
}
