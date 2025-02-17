import java.util.Scanner;

public class pracSix {

    public static void main(String[] args) {
        
        //Input currency in rupees and output in USD.

        // 1 INR = 0.014 USD

        Scanner scanner = new Scanner(System.in);

        double INR = 0.0;
        double USD = 0.0;
        double USD2 = 0.0;
        double INR2 = 0.0;

        System.out.print("Enter the currency in INR: ");
        INR = scanner.nextDouble();

        System.out.print("Enter the currency in USD: ");
        USD2 = scanner.nextDouble();

        USD = (INR * 0.0115138);

        INR2 = (USD2 * 86.8496);

        System.out.println();
        System.out.printf("The currency INR to USD is: %,.2f\n", USD);
        System.out.printf("the currency USD to INR is: %,.2f\n", INR2);
        
        scanner.close();

    }
    
}
