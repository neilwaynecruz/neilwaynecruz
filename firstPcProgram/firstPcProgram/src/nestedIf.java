import java.util.*;

public class nestedIf {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        char choice1 = 'Y';
        int age;
        char sex;

        while (choice1 == 'Y'){

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a Male or Female (M/F): ");
        sex = scanner.next().toUpperCase().charAt(0);

        while (sex != 'M' && sex != 'F') {
            System.out.print("Invalid input! Please enter 'M' for Male or 'F' for Female: ");
            sex = scanner.next().toUpperCase().charAt(0);
        }
        

        if (age >= 18){
            if (sex == 'M'){
                System.out.println("\nYou are an ADULT now and you are a MALE");
            }
            else{
                System.out.println("\nYou are an ADULT now and you are a FEMALE");
            }
        }
        else if (age <= 17 && age >= 1){
            if (sex == 'M'){
                System.out.println("\nYou are still a MINOR and you are a MALE");
            }
            else{
                System.out.println("\nYou are still a MINOR and you are a FEMALE");
            }
        }else if (age == 0) {
            if (sex == 'M'){
                System.out.println("\nYou are still a BABY and you are a MALE");
            }
            else {
                System.out.println("\nYou are still a BABY and you are a FEMALE");
            }
        }else {
            if (sex == 'M'){
                System.out.println("\nYou are still not born yet but you will be a MALE");
            }
            else {
                System.out.println("\nYou are still not born yet but you will be a FEMALE");
            }
        }

        System.out.print("\n\nWANT TO INPUT AGAIN?(Y/N): ");
        choice1 = scanner.next().toUpperCase().charAt(0);
        System.out.print("\n\n");
    }
        scanner.close();
    }
    
}
