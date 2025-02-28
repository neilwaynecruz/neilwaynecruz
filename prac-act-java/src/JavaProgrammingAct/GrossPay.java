package JavaProgrammingAct;

import java.util.Scanner;

public class GrossPay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double hourlyRate;
        int hoursWorked;

        System.out.print("Enter your hourly rate: ");
        hourlyRate = scanner.nextDouble();

        System.out.print("Enter hours worked: ");
        hoursWorked = scanner.nextInt();

        System.out.println();
        System.out.println();

        double grossPay = (hourlyRate * hoursWorked);
        double withholdingTax = grossPay * 0.15;
        double netPay = grossPay - withholdingTax;

//        System.out.println("OUTPUT:");
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.printf("Gross Pay: %.1f\n", grossPay);
        System.out.printf("Withholding Tax: %.3f\n", withholdingTax);
        System.out.printf("Net Pay: %.3f\n", netPay);

    }
}
