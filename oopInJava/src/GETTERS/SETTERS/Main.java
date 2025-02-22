package GETTERS.SETTERS;

public class Main {
    public static void main(String[] args) {

        // GETTERS = methods that make fields READABLE;
        // SETTERS = Methods that make fields WRITEABLE
        // private
        // private final


        Car car = new Car("Corvette", "Blue", 70000);

        car.setColor("Red");
        car.setPrice(-120);


        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());



    }
}
