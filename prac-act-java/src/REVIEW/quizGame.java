package REVIEW;

import java.util.Scanner;

public class quizGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lives = 5;

        while (lives > 0) {

            System.out.println("Number of life/lives you have: " + lives);
            System.out.print("What is the in our solar system?: ");
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("Jupiter")){
                System.out.println();
                System.out.println("Life/lives: " + lives);
                System.out.println("YOUR ANSWER IS CORRECT!!");
                break;
            }else{
                lives--;
            }

            System.out.println();
        }

        if (lives == 0) {
            System.out.println("Number of life/lives you have: " + lives);
            System.out.println("YOU LOST!");
        }

        scanner.close();

    }

}
