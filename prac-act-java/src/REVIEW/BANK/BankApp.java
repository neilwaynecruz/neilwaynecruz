package REVIEW.BANK;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {

        System.out.println("**********************************");
        System.out.println("WELCOME TO BANKING SYSTEM PROGRAM");
        System.out.println("**********************************");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you current balance: ");
        double currentBalance = scanner.nextDouble();

        if (currentBalance < 0) {
            System.out.println("Invalid balance");
            System.exit(0); // exit the program // to terminate the program if balance is less than 0
        }
        scanner.nextLine();

        BankAccount bal = new BankAccount(currentBalance);

        char choice = 0;
        double amount = 0.0;

        while (choice != '4') {
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);

            switch (choice) {
                case '1' -> bal.checkBalance();
                case '2' -> {
                    System.out.print("Enter amount to withdraw: ");
                    amount = scanner.nextDouble();
                    bal.withdraw(amount);
                }
                case '3' -> {
                    System.out.print("Enter amount to deposit: ");
                    amount = scanner.nextDouble();
                    bal.deposit(amount);
                }
                case '4' -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice");
            }
            System.out.println();
        }
        scanner.close();
    }

}
