package Programs;

import java.util.*;
public class ternaryOperator {

    public static void main(String[] args) {
        
        // ternary operator ? = return 1 of 2 if a condition is true

        // variable = (condition) ? ifTrue : ifFalse

        Scanner scanner = new Scanner(System.in);

        int score;
        int num;
        int timeOfDay;

        System.out.print("Enter your score: ");
        score = scanner.nextInt();

        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        System.out.print("Enter time of day: ");
        timeOfDay = scanner.nextInt();

        String passOrFail = (score >= 60) ? "\nPASS!!" : "\nFAIL!!";

        String evenOrOdd = (num % 2 == 0) ? "EVEN" : "ODD";

        String amOrPm = (timeOfDay < 12) ? "A.M" : "P.M"; // military time

        System.out.println(passOrFail);
        System.out.println(evenOrOdd);
        System.out.println(amOrPm);

        scanner.close();
    }
    
}
