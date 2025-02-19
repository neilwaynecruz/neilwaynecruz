package OOP7;

public class Student extends Person {

    double gpa;

    Student(String firstName, String lastName, double gpa){
        super(firstName,lastName);
        this.gpa = gpa;
    }

    void showGpa(){
        System.out.println(this.firstName + "'s gpa is: " + this.gpa);
    }

}
