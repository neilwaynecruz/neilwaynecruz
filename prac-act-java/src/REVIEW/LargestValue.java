package REVIEW;

import java.util.Scanner;

public class LargestValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

//        int max = a;
//
//        if (b > max){
//            max = b;
//        }
//
//        if (c > max){
//            max = c;
//        }
//        System.out.println(max);

//        or

       System.out.println(Math.max(Math.max(a, b), c));

        scanner.close();


    }
}
