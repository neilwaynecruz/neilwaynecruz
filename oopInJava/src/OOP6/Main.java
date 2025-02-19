package OOP6;

public class Main {
    public static void main(String[] args) {

        /* Inheritance = One class inherits the attributes and methods from another class.
                        CHILD <-- PARENT

                        extends
         */

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        plant.photosynthesize();
        System.out.println(plant.isAlive);
    }
}