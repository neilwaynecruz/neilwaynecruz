package Programs;

import java.util.*;
public class calculatorProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstNum  = 0;
        double secondNum = 0;
        char operator;
        double result = 0;
        boolean validOperator = true; // flags to determine if the operator is valid (true) or not (false)

        System.out.print("Enter the First number: ");
        firstNum = scanner.nextDouble();
        
        System.out.print("Enter an Operator (+, -, *, /, %, ^(power)): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the Second number: ");
        secondNum = scanner.nextDouble();

        switch (operator) { // start of enchanced switch statement
            case '+' -> result = firstNum + secondNum;
            case '-' -> result = firstNum - secondNum;
            case '*' -> result = firstNum * secondNum;
            case '/' -> {
                if (secondNum == 0){ // start of if-else condition if second number is equal to 0 or not
                    System.out.println("\n\"CAN'T DIVIDED BY 0!!\"");
                    validOperator = false;
                }
                else{
                    result = firstNum / secondNum;
                }
            }
            case '%' -> result = firstNum % secondNum;
            case '^' -> result = Math.pow(firstNum, secondNum);
            default -> {
                System.out.println("\n\"INVALID OPERATOR!!\"");
                validOperator = false;
            }
        } // end of enchanced switch statement

        if(validOperator == true){ // start to output the result if the operator is valid "ONLY"
            System.out.println("\nResult: " + result);
            System.out.println("\n");
        }
            scanner.close();
    }
}
