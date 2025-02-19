package OOP7;

public class Employee extends Person {

    double salary;

    Employee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    void showSalary() {
        System.out.println(firstName + "'s salary is : P" + salary);
    }
}
