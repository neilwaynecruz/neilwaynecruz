package MethodOverriding;

public class Main {
    public static void main(String[] args) {
        // Method overriding = when a subclass provides its own
        //                     implementation of a method that is already defined.
        //                     Allow for code reusability and give specific implementation.

        //                     @Override


        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        animal.move();
        dog.move();
        cat.move();
        fish.move();




    }
}
