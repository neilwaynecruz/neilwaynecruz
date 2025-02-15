import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        // start program

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number you want to add: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter another number you want to add: ");
        int num2 = scanner.nextInt();

        System.out.println(sum(num1, num2));
    }

    static int sum(int num1, int num2) {
        if (num2 > num1) {
            return num2 + sum(num1, num2 - 1);
        } else if (num1 > num2) {
            return num1 + sum(num1 - 1, num2);
        } else {
            return num1;
        }
    }
}