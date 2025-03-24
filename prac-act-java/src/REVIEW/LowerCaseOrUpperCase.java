package REVIEW;

import java.util.Scanner;

public class LowerCaseOrUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letter = scanner.next().trim().charAt(0);

        if(letter >= 'a' && letter <= 'z') {
            System.out.println("The letter " + letter + " is lowercase");
        }else{
            System.out.println("The letter " + letter + " is uppercase");
        }

        scanner.close();

    }
}
