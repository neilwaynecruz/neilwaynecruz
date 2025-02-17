package REVIEW;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println();

        String[] email = new String[5];
        String[] u_name = new String[5];
        String[] password = new String[5];

        for(int i = 0; i<email.length; i++){

            System.out.println("USER: " + (i + 1) + " at INDEX: " + i);
            System.out.print("Enter your email: ");
            email[i] = scanner.nextLine();

            System.out.print("Enter your username: ");
            u_name[i] = scanner.nextLine();

            System.out.print("Enter your password: ");
            password[i] = scanner.nextLine();
            System.out.println();
            System.out.println();

        }

        System.out.println();
        System.out.println("User Information: ");
        for(int i = 0; i < email.length; i++){
            System.out.println();
            System.out.println("User " + (i+1));
            System.out.println("Email: " + email[i]);
            System.out.println("Username: " + u_name[i]);
            System.out.println("Password: " + password[i]);
        }
            
        scanner.close();
    }
}
