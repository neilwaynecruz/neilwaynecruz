import java.util.Scanner;

public class pracThree {
    public static void main(String[] args) {
        
        // Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

       Scanner scanner = new Scanner(System.in);

       double principal = 0.0;
       double rate = 0.0;
       double time = 0.0;
       double simpleInt = 0.0;
       double amount = 0.0;

       System.out.print("Enter a your Principal Amount: ");
       principal = scanner.nextDouble();

       System.out.print("Enter a your Rate of Interest: ");
       rate = scanner.nextDouble();

       System.out.print("Enter a time: ");
       time = scanner.nextDouble();

       simpleInt = (principal * rate * time) / 100;
       principal = (100 * simpleInt) / (rate * time);
       rate = (100 * simpleInt) / (principal * time);
       time = (100 * simpleInt) / (principal * rate);
       amount = principal + simpleInt;


        System.out.printf("\nSimple Interest: P%.2f\n", simpleInt);
        System.out.printf("Amount: P%.2f \n", amount);
        System.out.printf("Principal: P%.2f\n", principal);
        System.out.printf("Rate: P%.2f\n", rate);
        System.out.printf("Time: P%.2f\n", time);
        
        scanner.close();
    }
}
