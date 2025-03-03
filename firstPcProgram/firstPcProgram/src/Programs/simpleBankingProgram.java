package Programs;

import java.util.*;

public class simpleBankingProgram {

    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){

        double balance = 0;
        boolean isRunning = true;
        int choice = 0;

    while (isRunning){
        System.out.println("****************");
        System.out.println("BANKING PROGRAM");
        System.out.println("****************");

        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("****************");

        System.out.print("Enter your choice (1-4): ");
        choice = scanner.nextInt();


        switch (choice) {
            case 1 -> showBalance(balance);
            case 2 -> balance = balance + deposit();
            case 3 -> balance = balance - withdraw(balance);
            case 4 -> {
                System.out.println("*******************************");
                System.out.println("YOU'VE EXITED IN THE PROGRAM");
                System.out.println("THANK YOU AND HAVE A NICE DAY!");
                System.out.println("*******************************\n");
                isRunning = false;
            }
            default -> System.out.println("INVALID INPUT, TRY AGAIN!");
        }

    }

        scanner.close();
    }
    
    static void showBalance(double balance){
        System.out.println("****************");
        System.out.printf("$%.3f\n", balance);
    }

    static double deposit(){
        double amount;

        System.out.println("****************");
        System.out.print("Enter amount you want to deposit: ");
        amount = scanner.nextDouble();

        if (amount < 0){
            System.out.println("AMOUNT CAN'T BE NEGATIVE!!");
            return 0;
        }
        else{
            return amount;
        }
    }

    static double withdraw(double balance) {

        double amount;

        System.out.println("****************");
        System.out.print("Enter the amount you want to withdrawn: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("INSUFFICIENT BALANCE/FUNDS!!");
            return 0;
        }
        else if (amount < 0){
            System.out.println("Amount can't be NEGATIVE!!");
            return 0;
        }
        else{
            return amount;
        }
        
    }
}

