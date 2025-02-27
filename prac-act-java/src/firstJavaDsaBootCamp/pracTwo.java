package firstJavaDsaBootCamp;

import java.util.*;
public class pracTwo {
    public static void main(String[] args) {

        // Take name as input and print a greeting message for that particular name.

        Scanner scanner = new Scanner(System.in);

        String name;

        System.out.print("What is you name?: ");
        name = scanner.nextLine();

        System.out.println("Hello and Good Morning " + name);
        
        scanner.close();
    }
    
}
