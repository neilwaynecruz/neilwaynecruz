package Generics;

// import java.util.ArrayList;
// import java.util.Collections;

public class Main {
    public static void main(String[] args) {

//        Generics = A concept where you can write a class, interface, or method
//                   that is compatible with different data types.
//                   <T> type parameter (placeholder that gets replaced with a real type)
//                   <String> type argument (specified the type)


//        Box<String> box = new Box<>();
//        Box<Integer> box2 = new Box<>();
//
//        box.setItem("Neil");
//        box2.setItem(123);
//
//        System.out.println(box.getItem());
//        System.out.println(box2.getItem());

        Product<String, Double> product1 = new Product<>("Laptop", 1200.00);
        Product<String, Integer> product2 = new Product<>("Cinema Ticket", 500);


        System.out.println("FOR PRODUCT 1");
        System.out.println("Get Item: " + product1.getItem());
        System.out.println("Get price: " + "P" + product1.getPrice());
        product1.setItem("Desktop");
        product1.setPrice(2000.00);
        System.out.println("New Item, Get type: " + product1.getItem());
        System.out.println("New Price, Get price: " + "P" + product1.getPrice());

        System.out.println("\n");

        System.out.println("FOR PRODUCT 2");
        System.out.println("Get Item: " + product2.getItem());
        System.out.println("Get price: " + "P" + product2.getPrice());
        product2.setItem("Bus Ticket");
        product2.setPrice(80);
        System.out.println("New Item, Get type: " + product2.getItem());
        System.out.println("New Price, Get price: " + "P" + product2.getPrice());

    }
}
