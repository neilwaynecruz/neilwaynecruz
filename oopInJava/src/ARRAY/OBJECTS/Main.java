package ARRAY.OBJECTS;

public class Main {
    public static void main(String[] args) {

        // array of an object = is an array of reference variables of the object
        //                      (not an array of the object itself)
        //                      in simple terms, it is an array of pointers to the object

        Car[] cars = {new Car("Toyota", "Red"),
                      new Car("Honda", "Blue"),
                      new Car("Ford", "Green")};

        for(Car car: cars){
            car.color = "White";
            car.drive();
        }
    }
}

