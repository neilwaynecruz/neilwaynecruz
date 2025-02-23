package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //                 Exception = An event that interrupts the normal flow of the program
        //                 (dividing by zero, file not found, array index out of bounds, mismatch input, etc)
        //                 Surround any dangerous code with a try{} block
        //
        //                try{}, catch{}, finally{}

        /*
                try {
                    //block of code to try
                } catch (Exception e) {
                    //block of code to handle errors
                } finally {
                    //block of code to execute regardless of the try/catch block
                }

         */

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n1 = scanner.nextInt();
            System.out.println(n1);
        }
        catch(InputMismatchException e){
            System.out.println("This is not a number");
        }
        finally {
            System.out.println("Finally block");
        }

    }

}
