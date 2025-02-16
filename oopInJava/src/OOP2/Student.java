package OOP2;

public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // constructor
    Student (String name, int age, double gpa, boolean isEnrolled){
        this.age = age;
        this.name = name;
        this.gpa = gpa;
        this.isEnrolled = isEnrolled;
    }

    void toStudy(){
        System.out.println(this.name + " is studying");
    }
}
