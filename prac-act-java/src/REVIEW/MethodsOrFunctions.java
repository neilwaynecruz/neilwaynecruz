package REVIEW;

import java.util.Scanner;

public class MethodsOrFunctions {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String name = sayHello();
        double product = product();
        System.out.print("Enter two values: ");
        int nums1 = scanner.nextInt();
        int nums2 = scanner.nextInt();
        int[] totnums = switchValue(nums1, nums2);



        System.out.println();
        System.out.println();
        System.out.println("Hello " + name + "!");
        System.out.println("The product is: " + product);
        System.out.println("Switched values: " + "Num1: " + totnums[0] + " " + "Num2: " + totnums[1]);



        String name2 = "Neil Wayne";
        System.out.println(changeName(name2));


    }

    static String changeName(String name) {
        return name + " Cruz";
    }

    static String sayHello() {
        System.out.print("What is your name?: ");
        String name = scanner.nextLine();
        return name;
    }

    static double product(){
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 * num2;
    }

    static int[] switchValue(int val1, int val2){
        int temp = val1;
        val1 = val2;
        val2 = temp;
        return new int[]{val1, val2};
    }


}
