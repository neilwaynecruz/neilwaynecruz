package ObjectOrientedProgrammingIntro;

public class Car {

    String make;
    String model;
    int year;
    double price;
    boolean isRunning;

    void start(){
        System.out.println("you start the engine of " + make + " " +  model);
    }

    void stop(){
        System.out.println("you stop the engine of " + make + " " +  model);
    }

    void Running(boolean isRunning){
        if(isRunning){
            System.out.println("Your car " + make + " " +  model + " is running");
        }
        else {
            System.out.println("Your car " + make + " " +  model + " is not running");
        }
    }

    void drive(){
        System.out.println("You drive the " + model);
    }

    void Break(){
        System.out.println("You break the " + model);
    }
}
