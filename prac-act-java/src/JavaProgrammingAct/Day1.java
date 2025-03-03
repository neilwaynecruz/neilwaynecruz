package JavaProgrammingAct;

import java.io.IOException;

import java.io.*;

public class Day1 {
    public static void main(String[] args) throws IOException {
        String firstname, lastname;
        int age;
        double weight;

        BufferedReader buffread = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter firstname: ");
        firstname = (buffread.readLine());

        System.out.print("Enter lastname: ");
        lastname = (buffread.readLine());

        System.out.print("Enter age: ");
        age = Integer.parseInt(buffread.readLine());

        System.out.print("Enter weight: ");
        weight = Double.parseDouble(buffread.readLine());

        System.out.println();
        System.out.println("Your Name is: " + firstname + " " + lastname);
        System.out.println("Your Age is: " + age);
        System.out.println("Your Weight is: " + weight);



//        System.out.println("Object Oriented Programming");
//        System.out.println("Using Java");
//
//        int x = 5, y = 7;
//        float pi = 3.14159F;
//        double pi2 = 6.9999;
//        char letter = 'A';
//        boolean isTrue = true;
//        String word = "bsit";
//
//        System.out.println("x = " + x + ", y = " + y);
//        System.out.println("letter = " + letter);
//        System.out.println("pi = " + pi);
//        System.out.println("pi2 = " + pi2);
//        System.out.println("isTrue = " + isTrue);
//        System.out.println("word = " + word);

    }
}


