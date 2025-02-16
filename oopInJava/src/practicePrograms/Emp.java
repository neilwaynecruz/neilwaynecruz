package practicePrograms;

public class Emp {
    String name;
    String email;
    String field;
    int age;
    double salary;

    Emp (String name, String email, String field, int age, double salary){
        this.name = name;
        this.email = email;
        this.field = field;
        this.age = age;
        this.salary = salary;
    }

    double salaryDeduction(double salary){
        if(this.salary >= 90000){
            return this.salary = this.salary - 10000;
        }
        else {
            return this.salary;
        }
    }
}
