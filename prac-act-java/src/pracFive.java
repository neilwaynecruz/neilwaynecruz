import java.util.*;

public class pracFive {
    public static void main(String[] args) {
        //Take 2 numbers as input and print the largest number.

        Scanner scanner = new Scanner(System.in);

        double num1, num2, largest = 0.0;

        System.out.print("Enter a 1st number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter a 2nd number: ");
        num2 = scanner.nextDouble();

       // largest = Math.max(num1, num2);

       if(num1 > num2){
            largest = num1;
       }
       else{
            largest = num2;
       }

        System.out.println("\nThe largest is: " + largest);
        scanner.close();
    }
    
}
