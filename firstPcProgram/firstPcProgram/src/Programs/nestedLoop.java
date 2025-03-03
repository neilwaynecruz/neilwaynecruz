package Programs;

import java.util.Scanner;

public class nestedLoop {
    public static void main (String[] args){

        // nested loop = A loop inside another loop, 
        //               used often with matrices or DSA

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the NUMBER of ROW/S: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the NUMBER of COLUMN/S: ");
        int columns = scanner.nextInt();

        System.out.print("Enter the SYMBOL you will USE: ");
        char symbol = scanner.next().charAt(0);

        System.out.println();


        for (int i = 1; i<=rows; i++){
            for (int j = 1; j<=columns; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
        scanner.close();
    }
}