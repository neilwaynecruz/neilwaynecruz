package StaticKeyword;
/* static = is a keyword. This means that a variable or method belongs to the class itself,
                    rather than to a specific instance (object) of the class.

                    Static variables are shared among all objects of a class.
                    Changing the value in one place updates it for all instances.

                    Static methods can be called without creating an object of the class.
                    They are often used for utility functions (like Math.pow()).

                    When to Use static:
                    - For constants or values shared by all instances.
                    - For utility methods that don’t rely on instance-specific data.
                    - For keeping track of class-wide information.
*/
public class Main{
    public static void main(String[] args) {


        Friend f1 = new Friend("Winter", 2);
        Friend f2 = new Friend("Neil", 19);
        Friend f3 = new Friend("Nathan", 14);
        Friend f4 = new Friend("Wendy", 41);
        Friend f5 = new Friend("Jack", 22);
        Friend f6 = new Friend("John", 21);

        
        System.out.println(f1.name + " is " + f1.age + " years old.");
        System.out.println(f2.name + " is " + f2.age + " years old.");
        System.out.println(f3.name + " is " + f3.age + " years old.");
        System.out.println(f4.name + " is " + f4.age + " years old.");
        System.out.println(f5.name + " is " + f5.age + " years old.");
        System.out.println(f6.name + " is " + f6.age + " years old.");
        System.out.println(Friend.numOfFriends + " friends in total.");
        
    }
}
