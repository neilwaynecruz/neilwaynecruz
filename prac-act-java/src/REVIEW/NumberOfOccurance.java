package REVIEW;

import java.util.Scanner;

public class NumberOfOccurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a numeric value: ");
        long num = scanner.nextInt();
        System.out.print("find the number of occurance of: ");
        long numOccurance = scanner.nextInt();
        long a = num;
        long remainder = 0L;
        long count = 0L;

        while(a > 0){
            long temp = a;
            a = temp / 10;
            remainder = temp % 10;

            if(remainder == numOccurance){
                count++;
            }
        }

        System.out.println("The number of occurrences of " + numOccurance + " in " + num + " is: " + count);
        scanner.close();
    }
}
