package REVIEW;

import java.util.Scanner;
public class dateFormatter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.print("Month in (number): ");
        int month = scanner.nextInt();

        System.out.print("Date in (number): ");
        int date = scanner.nextInt();

        System.out.print("Year: ");
        int year = scanner.nextInt();

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(isLeapYear(year)){
            daysInMonth[1] = 29;
        }

        if(month < 1 || month > 12){
            System.out.println("Invalid Month! The MONTH RANGE must be 1 to 12 only.");
        }else if(date < 1 || date > daysInMonth[month - 1]){
            System.out.println("Invalid Date! The DATE RANGE must be 1 to " + daysInMonth[month - 1]);
        }
        else {
            String monthName = getMonthName(month);
            System.out.println();
            System.out.println(monthName + " " + date + " " + year );
        }
        scanner.close();
    }

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    static String getMonthName(int month) {
        String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                             "October", "November", "December"};

        return monthName[month - 1];
    }

}
