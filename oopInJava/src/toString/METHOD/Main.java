package toString.METHOD;

public class Main {
    //.toString() = method inherited from the Object class.
    //              Used to return a string representation of an object.
    //              By default, it returns a hash code as a unique identifier.
    //              it can be overridden to provide meaningful details.

    public static void main(String[] args) {
        Car car1 = new Car("Bmw", "Coupe", 2025, "Red");
        Car car2 = new Car("Toyota", "Innova", 2025, "Blue");

        System.out.println(car1);
        System.out.println(car2);



    }
}
