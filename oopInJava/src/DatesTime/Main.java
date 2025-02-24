package DatesTime;

import java.time.*;

public class Main {

    public static void main(String[] args) {

        // How to work with DATES and TIMES using java.time package
        // (LocalDate, LocalTime, LocalDateTime, UTC, Period, Duration, DateTimeFormatter)


        //utc
//        Instant instant = Instant.now();
//
//        LocalDate date = LocalDate.now(); // for LocalDate
//        LocalTime time = LocalTime.now(); // for LocalTime
//        LocalDateTime dateTime = LocalDateTime.now(); // for LocalDateTime
//        Period period = Period.of(2021, 12, 31); // for Period
//        Duration duration = Duration.ofMinutes(30); // for Duration
//        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG); // for DateTimeFormatter

//        LocalDateTime datetime = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
//        String newDateTime = datetime.format(formatter);
//
//        System.out.println("Current Date and Time: " + newDateTime);

        LocalDateTime date1 = LocalDateTime.of(2024, 12, 25, 12, 0, 0);
        LocalDateTime date2 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);

        System.out.println("Date: " + date1);
        System.out.println("Date: " + date2);

        if (date1.isBefore(date2)) {
            System.out.println(date1 + " \"is before\" " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " \"is after\" " + date2);
        } else {
            System.out.println(date1 + " \"is equal to\" " + date2);
        }



    }

}
