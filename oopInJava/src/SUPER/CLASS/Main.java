package SUPER.CLASS;

public class Main {

    public static void main(String[] args) {
        /* super = refer to the PARENT CLASS (subclass <-- superclass).
                   used in constructors and method overriding.
                   Calls the parent constructor to initialize attributes.

                   super
         */


        Person person = new Person("Neil Wayne", "Cruz");
        Student student = new Student("Winter", "Cruz", 1.5);
        Employee employee = new Employee("Nathan", "Cruz", 35000.00);

        student.showName();
        student.showGpa();

        System.out.println();
        employee.showName();
        employee.showSalary();

    }
}
