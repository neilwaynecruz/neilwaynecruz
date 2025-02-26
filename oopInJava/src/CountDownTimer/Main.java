package CountDownTimer;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        //countdown timer

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many seconds do you want to count down?: ");
        int seconds = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int i = seconds;

            @Override
            public void run() {
                System.out.println(i);
                i--;
                if(i < 0){
                    System.out.println("TIMER IS DONE");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
        scanner.close();
    }
}
