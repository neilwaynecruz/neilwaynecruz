import java.util.*;

public class mathMethod{
    public static void main (String[] args){
/*       
        double result;

       System.out.println(result = Math.pow(2, 3));
       System.out.println(Math.abs(-12));
       System.out.println(Math.sqrt(9));
       System.out.println(Math.round(3.14));
       System.out.println(Math.ceil(3.1));
       System.out.println(Math.floor(3.99));
       System.out.println(Math.max(10, 20));
       System.out.println(Math.min(10, 20));
       */   

       //compute the hypotenuse: c = sqrt(a^2 + b^2)

       Scanner scanner = new Scanner(System.in);

       double a,b,c; // c for hypothenous

       System.out.print("Enter number for radius (side length a): ");
       a = scanner.nextDouble();

       System.out.print("Enter number for B: ");
       b = scanner.nextDouble();

       c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

       System.out.println("\n\nThe hypotenuse of right triangle is c = " + c + " cm");
       System.out.printf("The hypotenuse of right triangle is c = %.4f cm\n\n", c);

       scanner.close();

    }
}