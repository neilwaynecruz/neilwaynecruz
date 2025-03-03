package Programs;

import java.util.*;

public class shoppingCart {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("What item do you like to purchase?: ");
        String item = scanner.nextLine();

        System.out.print("What is the price for each item?: ");
        double price = scanner.nextDouble();

        System.out.print("How many item/s you buy?: ");
        int quantity = scanner.nextInt();

        double total = (double)price * (int)quantity;

        System.out.println("\n\nYou've bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + "$" + total);
        
        scanner.close();
    }
}
