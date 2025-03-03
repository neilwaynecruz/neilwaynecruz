package Programs;

import java.util.*;

public class overloadMethod {
    public static void main(String[] args) {
        
        /* overload Method = method that share the same name,
                             but with different paremeters
                             signature = name + parameters
        */ 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter type of bread on pizza you want: ");
        String typeOfBread = scanner.nextLine();

        System.out.print("Enter type of cheese on pizza you want: ");
        String typeOfCheese = scanner.nextLine();

        System.out.print("Enter type of toppings on pizza you want: ");
        String typeOfToppings = scanner.nextLine();

        String pizza1 = bakePizza(typeOfBread);
        String pizza2 = bakePizza(typeOfBread, typeOfCheese);
        String pizza3= bakePizza(typeOfBread, typeOfCheese, typeOfToppings);

        System.out.println(pizza1);
        System.out.println(pizza2);
         System.out.println(pizza3);

        scanner.close();
    }

    static String bakePizza(String typeOfBread){
        return typeOfBread + " " + "pizza";
    }

    static String bakePizza(String typeOfBread, String typeOfCheese ){
        return typeOfCheese + " " + typeOfBread + " " + "pizza";
    }

    static String bakePizza(String typeOfBread, String typeOfCheese, String typeOfToppings){
        return typeOfToppings + " " + typeOfCheese + " " + typeOfBread + " " + "pizza";
    }
}
