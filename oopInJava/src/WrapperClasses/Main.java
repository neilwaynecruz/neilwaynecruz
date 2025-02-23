package WrapperClasses;

public class Main {
    public static void main(String[] args) {
//        Wrapper classes = allows primitive values (int,double,float,char,boolean)
//                          to be used as objects. "Wrap then in an object"
//                          Generally, don't wrap primirive unless you need an object.
//                          Allows use of Collection Framwork and static Utility Methods.

        //Autoboxing
//        Integer a = 123;
//        Double b = 123.456;
//        Character c = 'C';
//        Boolean d = true;
//        String e = "Batman";


        // Unboxing
//        int x = a;
//        double y = b;
//        char z = c;
//        boolean w = true;

//        int a = Integer.parseInt("123");
//        double b = Double.parseDouble("123.45");
//        char c = "Batman".charAt(0);
//        boolean d = Boolean.parseBoolean("true");

        char letter = 'b';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));



    }
}
