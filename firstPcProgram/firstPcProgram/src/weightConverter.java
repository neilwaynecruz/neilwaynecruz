import java.util.*;

public class weightConverter {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;

        System.out.println("WEIGHT CONVERTION PROGRAM");

        System.out.println("Enter 1: Convert lbs(pounds) to kg/s(kilogram/s)");
        System.out.println("Enter 2: Convert kg/s(kilogram/s) to lbs(pounds)");

        System.out.print("Choose an option: ");
        int option = scanner.nextInt();

        if (option == 1) {
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The weight in kgs is: %.2f\n", newWeight);

        }
        else if (option == 2) {
            System.out.print("Enter the weight in kg/s: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The weight in lbs is: %.2f\n", newWeight);
        } 
        else {
            System.out.println("Please enter a right option between 1 or 2 ONLY");
        }

        scanner.close();

    }
}
