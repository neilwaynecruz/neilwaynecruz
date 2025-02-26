package TimerTask;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Timer = CLASS that schedules task at specific times or periodically
//                Useful for: sending notifications, scheduled updates, repetitive actions, etc.
//
//
//         TimerTask = Represents the task that will be executed by the timer you will extend
//                     You will extend the TimerTask class to define your task
//                     Create a subclass of TimerTask and @Override run() method

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 3;
            int i = 1;
            @Override
            public void run() {
                System.out.println(i);
                i++;
                count--;
                if (count == 0) {
                    System.out.println("TIMER IS DONE");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 0, 2000);

    }
}
