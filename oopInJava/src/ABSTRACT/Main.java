package ABSTRACT;

public class Main {

    public static void main(String[] args) {

        /* abstract = used to define abstract classes and methods.
                      Abstraction is the process of hiding implementation details
                      and showing only the essential features;
                      Abstract classes CAN'T be instantiated directly
                      Can contain 'abstract' methods (WHICH MUST BE IMPLEMENTED)
                      can contain 'concrete' methods (WHICH ARE INHERITED)
         */

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(3,5);
        Rectangle rectangle = new Rectangle(6,7);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());


    }
}
