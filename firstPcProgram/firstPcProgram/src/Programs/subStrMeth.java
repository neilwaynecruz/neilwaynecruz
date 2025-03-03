package Programs;

import java.util.Scanner;
public class subStrMeth {
    public static void main(String[] args) {
        
        // .substring() = used to extract portion of a string 
        // .substring(start, end);

        Scanner scanner = new Scanner(System.in);

        String email;

        System.out.print("Enter your username: ");
        email = scanner.nextLine();
        if (email.contains("@")){

            System.out.println(email.substring(0, email.indexOf("@")));
            System.out.print(email.substring(email.indexOf("@") + 1));
        }
        else{
            System.out.println("Emails must contain @");
        }
        scanner.close();
    }    
}
