import java.util.Scanner;
import java.util.Arrays;

public class arrayInputToUser {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter how many you want to input in an array: ");
        int n = scanner.nextInt(); // to get the number of elements in an array
        scanner.nextLine(); // to consume the next line character
        
        String[] foods = new String[n];  // array declaration
        System.out.println();

        for (int i = 0; i < foods.length; i++){
            System.out.print("Enter food name: ");
            foods[i] = scanner.nextLine(); // to get the input from the user in an array
        }

        System.out.println("\nThe food you entered are: ");

        for (String i : foods){
            System.out.println(i); // to print the elements of an array
        }
        System.out.println();

        Arrays.sort(foods); // to sort the elements of an array

        System.out.println("The sorted food you entered are: ");
        for (String i : foods){
            System.out.println(i); // to print the elements of an array
        }

        System.out.println();
        scanner.close();
    }
    
}
