package  practicePrograms;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            Emp emp1 = new Emp("Neil", "neil@gmail.com", "IT", 19, 200000);

            emp1.salary = emp1.salaryDeduction(emp1.salary);

            System.out.println(emp1.name);
            System.out.println(emp1.email);
            System.out.println(emp1.field);
            System.out.println(emp1.age);
            System.out.println(emp1.salary);
            System.out.println();


    }
}
