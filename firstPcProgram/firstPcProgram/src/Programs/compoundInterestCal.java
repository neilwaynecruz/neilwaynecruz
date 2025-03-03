package Programs;

import java.util.Scanner;

public class compoundInterestCal {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double principal;
        double interestRate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        interestRate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times compound per year/s: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of year/s: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + interestRate / timesCompounded, timesCompounded * years);

        System.out.printf("\n\nThe AMOUNT after %d year/s is P%,.2f\n\n", years , amount);



        scanner.close();
    }
    
}
