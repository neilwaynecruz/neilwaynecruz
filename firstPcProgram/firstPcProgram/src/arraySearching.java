import java.util.Scanner;
public class arraySearching {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Searching for a target number in an array
/* 
        int [] numbers = {0, 2, 4, 5, 1 , 9, 8, 7, 6, 3, 10, 20, 11, 13, 16, 14, 18, 19, 17, 15, 12, 22, 21, 25,
                          23, 24, 26, 30, 28, 27, 29, 32, 35, 33, 31, 38, 40, 37, 34, 36, 39};
        
        String answer = "yes";
        
        while (answer.equalsIgnoreCase("yes")){
            System.out.print("What is your target number to search for: ");
            int targetNum = scanner.nextInt();
            scanner.nextLine();

        for (int i = 0; i<numbers.length; i++){
            if (numbers[i] == targetNum){
                System.out.println("The target number is found at index: " + i);
                System.out.println();
                break;
            }
            if (i == numbers.length - 1){
                System.out.println("The target number is not found in the array\n");
            }
          }
          System.out.print("Do you want to search for another number? (yes/no): ");
          answer = scanner.nextLine();      
          System.out.println();
        }
*/
        
        // Searching for a target string in an array

/* 
        String[] cars = {"Toyota", "Honda", "Nissan", "Ford", "Chevrolet", "BMW", "Mercedes", "Audi", "Volkswagen", 
                         "Hyundai", "Kia", "Mazda", "Subaru", "Jeep", "Ram", "Dodge", "Chrysler", "Buick", "Cadillac", 
                         "GMC", "Acura", "Infiniti", "Lexus", "Lincoln", "Volvo", "Porsche", "Ferrari", "Lamborghini",};
        String target;
        String answer = "yes";

        
        while (answer.equalsIgnoreCase("yes")){
            System.out.print("What is your target car to search for: ");
            target = scanner.nextLine(); 
    
            for (int i = 0; i < cars.length; i++){
                if(cars[i].equalsIgnoreCase(target)){
                    System.out.println("The target car is found at index: " + i);
                    System.out.println();
                    break;
                }
    
                if (i == cars.length - 1){
                    System.out.println("The target car is not found in the array\n");
                }
            }   
            
            System.out.print("Do you want to search for another car? (yes/no): ");
            answer = scanner.nextLine();
            System.out.println();
        }
*/
        scanner.close();
    }
}
