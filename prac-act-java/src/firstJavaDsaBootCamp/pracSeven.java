package firstJavaDsaBootCamp;

import java.util.Scanner;

public class pracSeven {
    public static void main(String[] args) {
        // To calculate Fibonacci Series up to n numbers.

        Scanner scanner = new Scanner(System.in);

        long n = 0, term1 = 0, term2 = 1, nextTerm = 0;

        System.out.print("Enter the number of terms: ");
        n = scanner.nextInt();

        System.out.println("Fibonacci Series: ");
        
        for(int i = 0; i <= n ; i++){
            System.out.print(term1);

            nextTerm = term1 + term2;
            term1 = term2; 
            term2 = nextTerm; 
            
            if(i != n)
                System.out.print(" + ");      
        }
        scanner.close();
    }
}
