package REVIEW;

import java.util.Scanner;

public class authenticationChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] username = {"neilwayne14", "winter2", "nathan0714"};
        String[] password = {"WayneCruz1414", "winterganda", "than14"};
        String user;
        String pass;
        boolean isFound = false;

        System.out.print("Enter your username : ");
        user = scanner.nextLine();

        System.out.print("Enter your password : ");
        pass = scanner.nextLine();

        System.out.println();

        for(int i = 0; i < username.length; i++){
            if(username[i].equals(user) && password[i].equals(pass)){
                isFound = true;
                break;
            } else if(!username[i].equals(user) && !password[i].equals(pass)) {
                System.out.println("Wrong username or password");
                break;
            }
        }

        if (isFound) System.out.println("Welcome " + user + "!");
        else System.out.println("Account not found");

        scanner.close();

    }
}
