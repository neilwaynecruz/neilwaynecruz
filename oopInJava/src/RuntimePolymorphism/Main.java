package RuntimePolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Runtime polymorphism = When the method that gets executed is decided at
        //                        runtime based on the actual type of the object.

        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = car): ");
        int response = scanner.nextInt();

        if (response == 1) {
            animal = new Dog();
            animal.speak();
        }
        else if (response == 2) {
            animal = new Cat();
            animal.speak();
        }
        else {
            System.out.println("INVALID INPUT");
        }

        scanner.close();
    }
}
