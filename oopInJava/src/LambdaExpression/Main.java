package LambdaExpression;

public class Main {
    public static void main(String[] args) {

//        lambda expression = feature for java 8 and above
//                            also known as anonymous method
//                            a shorter way to write anonymous classes with only ONE METHOD

//        need to use a functional interface or use a pre-defined functional interface
//          they contain only ONE ABSTRACT METHOD
//        ex: Runnable, ActionListener, Callable, Comparator, (user-defined)

//        A lambda expression can be used in any place where a functional interface is expected.
//
//        How to use lambda expression:
//        (argumnets) -> { body of method/statements }

//        Example: (int a, int b) -> { return a + b; }

//        -> is an arrow operator or lambda operator

//       MyInterface myInterface1 = new MyInterface() {
//            @Override
//            public void message() {
//                System.out.println("Hello from anonymous class");
//            }
//        };

//        or

//        String name = "Wayne";
//        char symbol = '!';
//
//        MyInterface myInterface = (x,y) -> {
//            System.out.println("Hello " + x + " from lambda expression1" + y);
//            System.out.println(x + " is so pogi" + y);
//        };
//        myInterface.message(name, symbol);

         new MyFrame();


    }
}
