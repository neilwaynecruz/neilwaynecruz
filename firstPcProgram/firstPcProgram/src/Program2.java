import java.util.Scanner;;

public class Program2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
/*
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is you Gpa?: ");
        double gpa = scanner.nextDouble();

        System.out.println("\nHello " + name);
        System.out.println("Your age is " + age + " years old");
        System.out.println("Your gpa is " + gpa);
*/
/*       
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // to avoid bugs

        System.out.print("Enter your favorite car: ");
        String car = scanner.nextLine();

        System.out.println("\nYou are " + age + " years old");
        System.out.println("Your favorite car is " + car);
*/ 

        //calculate area of rectangle

        System.out.print("Enter the length of the reectangle: ");
        double recLength = scanner.nextDouble();
        
        System.out.print("Enter the width of the reectangle: ");
        double recWidth = scanner.nextDouble();

        double recArea = (recLength * recWidth);

        System.out.println("The total area of the rectangle is: " + recArea + " cm^2");

        scanner.close();
    } 
}
