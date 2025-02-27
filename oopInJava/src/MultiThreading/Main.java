package MultiThreading;

public class Main {
    public static void main(String[] args) {


//       Multithreading = Enables a program to run multiple threads concurrently
//                        (Thread = A set of instructions that run independently)
//                        Useful for background tasks or time-consuming operations

        Thread thread1 = new Thread(new MyRunnable("PING"));
        Thread thread2 = new Thread(new MyRunnable("PONG"));



        System.out.println("Starting threads");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e) {
            System.out.println("Main Thread interrupted");
        }
        System.out.println("Threads started, main ends\n");
    }
}
