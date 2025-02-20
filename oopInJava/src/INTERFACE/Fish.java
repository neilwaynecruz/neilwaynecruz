package INTERFACE;

public class Fish implements Prey, Predator{

    @Override
    public void flee(){
        System.out.println("*The fish is swimming*");
    }

    @Override
    public void hunt(){
        System.out.println("*The fish is hunting*");
    }
}
