import java.util.*;
public class mathMethod2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double circumference, area, volume, radius;

        System.out.print("Enter a radius:  ");
        radius = scanner.nextDouble();
        
        circumference = 2.0 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2.0);
        volume = (((4.0/3.0) * Math.PI) * Math.pow(radius, 3.0));

        System.out.println("\n\nThe circumference is: " + circumference + "cm^2");
        System.out.println("The area is: " + area + "cm^2");
        System.out.println("The volue is: " + volume + "cm^3");

        scanner.close();
    }
}
