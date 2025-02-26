package ObjectOrientedProgrammingIntro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Object = An entity that holds data (attributes)
                   and can perform actions (Methods)
                   (It is a reference data types)
         */
        Scanner scanner = new Scanner(System.in);

        Car car1 = new Car();

        System.out.print("What is you car brand?: ");
        car1.make = scanner.nextLine();

        System.out.print("What is you car model?: ");
        car1.model = scanner.nextLine();

        System.out.print("When did your car created?: ");
        car1.year = scanner.nextInt();

        System.out.print("Enter a price of your car?: ");
        car1.price = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Is your car running (yes or no)?: ");
        String response = scanner.nextLine().toLowerCase();

        car1.isRunning = response.equals("yes"); // if response is equals to 'yes' it will return true, else return false
        System.out.println();
        System.out.println();
        car1.Running(car1.isRunning);
        car1.drive();
        car1.start();
        car1.Break();
        car1.stop();

        scanner.close();
    }
}