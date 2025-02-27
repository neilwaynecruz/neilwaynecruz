package firstJavaDsaBootCamp;

import java.util.Scanner;

public class prac1 {
    public static void main(String[] args) {

        // Write a program to print whether a number is even or odd, also take input from the user.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println(num + " is even");
        }
        else{
            System.out.println(num + " is odd");
        }
        scanner.close(); 

    }
}
