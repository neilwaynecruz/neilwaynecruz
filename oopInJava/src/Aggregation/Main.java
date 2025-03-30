package Aggregation;

public class Main {
    public static void main(String[] args) {

//        aggregation = represents a "has-a" relationship between objects.
//                        one objects can contain another object as part of its structure,
//                        but the contained object/s can exist independently


        Book[] books = {new Book("Noli Me Tangere", 480, "Jose Rizal"),
                        new Book("El Filibusterismo", 448, "Jose Rizal"),
                        new Book("Odyssey", 1264, "Homer"),};

        Library library = new Library("PH LIBRARY", 1988, books);

       library.displayInfo();


    }
}
