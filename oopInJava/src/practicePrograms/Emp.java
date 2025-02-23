package practicePrograms;

public class Emp {

    private String name;
    private int id;
    private int age;
    private double salary;

    Emp(String name, int age, double salary, int id) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.id = id;
    }

    String getName(){
        return this.name;
    }

    int getId(){
        return this.id;
    }

    int getAge(){
        return this.age;
    }

    String getSalary(){
        return "P" + this.salary;
    }

    void setName(String name){
        this.name = name;
    }

    void setId(int id){
        this.id = id;
    }

    void setAge(int age){
        this.age = age;
    }
    void setSalary(double salary){
        this.salary = salary;
    }

}
