package Programs;

import java.util.*;

public class tempConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 

        int choice = 1;

        while(choice == 1){
        System.out.print("Enter the temperature: ");
        double temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        Character unit = scanner.next().toUpperCase().charAt(0);

        Double newTemp = (unit.equals('C')) ? (temp-32) * 5/9 : (temp * 9/5) + 32;

        System.out.printf("\n%.1f°%c\n\n", newTemp,unit);

        System.out.print("You want to input again? (Press 1 to continue) OR (Press ANY number to exit): ");
        choice = scanner.nextInt();
        System.out.println();
      }
        scanner.close();
    }
}
