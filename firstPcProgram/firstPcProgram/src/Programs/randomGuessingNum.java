package Programs;

import java.util.*;

public class randomGuessingNum {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess = 0;
        int attempt = 0;
        int min = 0;
        int max = 0;

        System.out.println("NUMBER GUESSING GAME");
        
        System.out.print("Enter the range you want, 1st number: ");
        min = scanner.nextInt();

        System.out.print("Upto, 2nd number: ");
        max = scanner.nextInt();

        int randomNum = random.nextInt(min, max + 1);

        System.out.printf("Guess a number between %d-%d\n", min, max);

        do{
            System.out.print("\nEnter a guess: ");
            guess = scanner.nextInt();
            attempt++;

            if (guess < randomNum){
                System.out.println("TOO LOW!, Try again");
            }
            else if (guess > randomNum){
                System.out.println("TOO HIGH!, Try again");
            }
            else{
                System.out.println("CORRECT!, The number was: " + randomNum);
                System.out.println("Number of attempts you've made: " + attempt);
            }
        }while(guess != randomNum);

        System.out.println("END OF PROGRAM!");

        scanner.close();
    }
    
}
