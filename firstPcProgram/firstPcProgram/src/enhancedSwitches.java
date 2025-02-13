import java.util.Scanner;

public class enhancedSwitches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day: ");
        String day = scanner.nextLine().toLowerCase();

        
        if (!day.isEmpty()) {
            day = day.substring(0, 1).toUpperCase() + day.substring(1);
        }

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                System.out.println("\nIt's a weekday :((\n");
            case "Saturday", "Sunday" ->
                System.out.println("\nIt's the weekend :))\n");
            default ->
                System.out.println("\n" + day + " is not a valid day.\n");
        }

        scanner.close();
    }
}
