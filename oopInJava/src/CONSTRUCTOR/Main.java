package CONSTRUCTOR;

public class Main {
    public static void main(String[] args) {

        /* Constructor = A special method (in a class) to initialize objects
                         you can pass arguments to a constructor
                         and set up initial values.
         */

        Student student1 = new Student("Winter", 19, 1.00, false);
        Student student2 = new Student("Neil", 20, 1.50,true);
        Student student3 = new Student("Nathan", 14, 1.25, true);


        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        student1.toStudy();


        System.out.println();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);
        student2.toStudy();

        System.out.println();

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
        student3.toStudy();

    }
}