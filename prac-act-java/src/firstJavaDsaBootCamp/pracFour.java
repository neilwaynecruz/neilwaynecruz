package firstJavaDsaBootCamp;

import java.util.*;

public class pracFour {
    public static void main(String[] args) {
        // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

        Scanner scanner = new Scanner(System.in);
        
        double num1,num2,result = 0;
        char operator = ' ';

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter a operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();
        scanner.close();

        result = Computation(num1, num2, operator);


        if(!Double.isNaN(result))
        {
        System.out.printf("The result is: %.2f", result);
        }


    }

    static double Computation(double num1, double num2,  char operator){
        return switch (operator) 
        {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Can't divide by 0, UNDEFINED!");
                    yield Double.NaN; // yield is used to return a value from a switch statement
                                      //you only use it in switch statement if you want to return a value directly
                }
                else{
                    yield num1 / num2; // yield is used to return a value from a switch statement, 
                                     //you only use it in switch statement if you want to return a value directly
                }
            }
            default -> {
                System.out.println("INVALID OPERATOR, TRY AGAIN!");
                yield Double.NaN;
            }
        };
    }
    
}
