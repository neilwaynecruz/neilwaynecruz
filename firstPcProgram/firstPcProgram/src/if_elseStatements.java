import java.util.*;

public class if_elseStatements {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        int age = 0;
        char choice = 'Y';

        while (choice == 'Y' || choice == 'y'){  
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        
            if(age >= 65){
                System.out.println("\nYou are a SENIOR NOW!!\n");
            }
            else if (age >= 18){
                System.out.println("\nYou are an ADULT NOW!!\n");
            }
            else if (age == 0){
                System.out.println("\nYou are a such a CUTE BABY!!\n");
            }
            else if (age < 18 && age > 0){
                System.out.println("\nYou are stil a MINOR!!\n");
            }
            else{
                System.out.println("\nYou haven't BORN YET SADD :((\n");
            }

            System.out.print("You want to try again? [Y/N]: ");
            choice = scanner.next().charAt(0);
        }

        scanner.close();

    }
}