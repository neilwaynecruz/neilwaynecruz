package Enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Enums = (Enumerations) A special kind of class that represent a fixed set of collection or constants.
//                They improve code readability and are easy to maintain.
//                More efficient with switches when comparing Strings.

        Scanner scanner = new Scanner(System.in);

        System.out.print("What day is it today?: ");
        String days = scanner.nextLine().toUpperCase();

        try {
            Day day = Day.valueOf(days);
            System.out.println("Day Number: " + day.getDayNumber());
            switch (day){
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("It is a Weekday :(");
                case SATURDAY, SUNDAY -> System.out.println("It is a Weekend, YEY!! :)");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day, Please Input a valid day");
        }
        catch (Exception e) {
            System.out.println("An error occurred");
        }
        scanner.close();
    }
}
