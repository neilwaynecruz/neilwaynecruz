package JavaProgrammingAct;

import java.util.Scanner;

public class ConvertMinutesToHours {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();

        int hours = minutes / 60;
        int remMinutes = minutes % 60;

        System.out.println("Minutes: " + minutes);
        System.out.println("Converted hours: " + hours + " hours and " + remMinutes + " minutes");

    }
}
