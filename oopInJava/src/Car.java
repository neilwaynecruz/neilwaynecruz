public class Car {

    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2025;
    double price = 50000.00;
    boolean isUsed = false;
    

    void display() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println("Is used: " + isUsed);
    }

    void drive() {
        isUsed = true;
        System.out.println("You drive the " + model);
    }

    void stop() {
        isUsed = false;
        System.out.println("You stop the " + model);
    }

    void Break() {
        System.out.println("You step on the break of the " + model);
    }

}
