import java.util.Scanner;

public class PracNine {
    public static void main(String[] args) {

       // To find Armstrong Number

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int nums = scanner.nextInt();
        int length = (int) (Math.log10(nums) + 1); // Get the number of digits
//        String length1 = Integer.toString(nums); // Convert to string for easy digit access

        int sum = 0;
        int temp = nums;
        StringBuilder formula = new StringBuilder();

        // Compute sum and build the formula string
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, length);

            // Build the formula representation
            if (formula.length() > 0) {
                formula.insert(0, " + "); // Insert at the beginning
            }
            formula.insert(0, digit + "^" + length);

            temp /= 10;
        }

        // Print the result
        if (sum == nums) {
            System.out.println("Armstrong Number: " + formula + " = " + sum);
        } else {
            System.out.println("Not an Armstrong Number: " + formula + " = " + sum);
        }
        scanner.close();
    }
}
