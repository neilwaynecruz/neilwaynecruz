package practicePrograms;

import java.util.ArrayList;
// import java.util.Collections;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> color = new ArrayList<>();

        System.out.print("Enter number of colors you like: ");
        int numOfColors = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0 ; i < numOfColors; i++) {
            System.out.print("Enter all of you favorite colors you like: ");
            color.add(scanner.nextLine());
        }

        System.out.println();
        System.out.println("Your favorite colors are: " + color);

        scanner.close();


    }
}
