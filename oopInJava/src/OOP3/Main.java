package OOP3;

public class Main {
    public static void main(String[] args) {
        /*overloaded constructors = Allows a class to have multiple constructor
                                    with different parameter lists.
                                    Enable objects to be initialized in various ways.
         */

        User users0 = new User();
        User users1 = new User("Winter");
        User users2 = new User("Neil", "neil@gmail.com");
        User users3 = new User("Nathan", "nathan@gmail.com", 14);

        System.out.println(users0.userName + " " + users0.email + " " + users0.age);
        System.out.println(users1.userName + " " + users1.email + " " + users1.age);
        System.out.println(users2.userName + " " + users2.email + " " + users2.age);
        System.out.println(users3.userName + " " + users3.email + " " + users3.age);

    }
}