package Composition;

public class Engine {
    String Type;

    Engine(String type) {
        this.Type = type;
    }

    void start(){
        System.out.println("The engine " + this.Type + " is starting.");
    }


}
