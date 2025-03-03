package Programs;

import java.util.*;
public class Methods{
    public static void main(String[] args) {
        
        // Method/function = a block of reusable code that is executed when called ()

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number you want to \"SQUARED\": ");
        double num = scanner.nextDouble();

        System.out.print("Enter a number you want to \"CUBE\": ");
        double num2 = scanner.nextDouble();

        scanner.nextLine();
        
        System.out.print("Enter your First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("\nOUTPUT:\n" + Squared(num));
        System.out.println(Cube(num2));
        System.out.println(getTheFullName(firstName, lastName));
       

        if (ageChecker(age)) {
            System.out.println("You are an ADULT now");
        }
        else{
            System.out.println("You are still a MINOR");
        }

        scanner.close();
    }
        
   static double Squared(double num){
       return Math.pow(num, 2);
    }

    static double Cube(double num2){
        return Math.pow(num2, 3);
    }

    static String getTheFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    static boolean ageChecker(int age){
        if(age >= 18){
            return true;
        }  
        else{
            return false;
        }
    }

}