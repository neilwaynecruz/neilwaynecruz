package Threading;

public class myThread implements Runnable {

    int numThreads;

    myThread(int numThreads) {
        this.numThreads = numThreads;
    }

    @Override
    public void run() {
        for(int i = 1; i <= this.numThreads; i++) {
//            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }

            if(i == this.numThreads) {
                System.out.println("Time's up!");
                System.exit(0); // Terminates the program if i is equal to numThreads
            }
        }
    }
}
