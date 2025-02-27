package CreatingAlarmClock;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Java Alarm Clock

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "C:\\JAVA-OOP\\oopInJava\\src\\CreatingAlarmClock\\hip-hop-news-271179.wav";

        while (alarmTime == null) {
            try {
                System.out.print("Enter the time for the alarm in (HH:mm:ss): ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);

                if (alarmTime.isBefore(LocalTime.now())) {
                    System.out.println("The time has already passed today. Please enter a future time.");
                    alarmTime = null;
                } else {
                    System.out.println("Alarm set for: " + alarmTime);
                }

            } catch (DateTimeParseException e) {
                System.out.println("Invalid format. Please enter the time in (HH:mm:ss) format.");
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();


    }
}
