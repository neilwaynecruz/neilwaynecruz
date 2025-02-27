package Threading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Threading = Allows a program to run multiple tasks simultaneously
//                    Helps improve performance with time-consuming operations
//                (File I/0, network communications, or any background tasks)

//        How to create a thread in Java
//        Option 1: Extend the Thread class (Simpler and limited(single inheritance) and less flexible)
//        Option 2: Implement the Runnable interface (More flexible and better and recommended)

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many seconds do you want to create?: ");
        int numThreads = scanner.nextInt();
        scanner.nextLine(); // to consume the next line character

        myThread myThread = new myThread(numThreads);
        Thread thread = new Thread(myThread);
        thread.setDaemon(true);
        thread.start();

        System.out.println("You have " + numThreads + " second/s to enter your name");

        System.out.println();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name);

        scanner.close();

    }
}
