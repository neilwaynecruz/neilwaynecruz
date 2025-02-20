package SUPER.CLASS;

public class Person {

    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void showName(){
        System.out.println(this.firstName + " " + this.lastName);
    }
}
