package AnonymousClass;

public class Main {
    public static void main(String[] args) {
    // Anonymous class - is a class that doesn't have a name. Cannot be reused.
    //                   Add custom behavior without creating a new class.
    //                   Often used for ONE TIME USES. (e.g. event handling, TimerTask, Runnable, callbacks)


    // Anonymous class
        Dog dog = new Dog();
        Dog dogSpeak = new Dog() { // this is example of anonymous class
            @Override
            void Speak() {
                System.out.println("Dog says: *Hello people!!*");
            }
        }; // needed to end the class with a semicolon

        dog.Speak();
        dogSpeak.Speak();



    }

}
