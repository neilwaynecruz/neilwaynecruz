public class OOP {
    public static void main(String[] args) throws Exception {
        // object = an instance of a class that may contain attributes and methods
        //          An entity that hold data (attributes) and can perform actions (methods)
        //          it is a reference data type
        //          it is a variable that can store multiple values

        Car myCar = new Car();

        // to access the attributes of the object, use the dot operator (.)
        myCar.display(); // for the method display()
        System.out.println();

        // to access the methods of the object, use also the dot operator (.)

        myCar.drive(); // for the method drive()
        System.out.println("My car is used: " + myCar.isUsed);
        System.out.println();

        myCar.stop(); // for the method stop()
        System.out.println("My car is used: " + myCar.isUsed);
        System.out.println();

        myCar.Break(); // for the method Break()
        System.out.println(); 


    }
}
