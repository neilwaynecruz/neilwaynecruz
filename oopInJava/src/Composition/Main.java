package Composition;

public class Main {
    public static void main(String[] args) {

//      composition = Represents a "part-of" relationship between objects.
//                    for example, an Engine is "part of" a Car
//                    Allows complex object to be constructed from smaller object


        Car car = new Car("Corvette" , 2020, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        car.start();




    }
}
