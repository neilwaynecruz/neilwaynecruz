package ArrayList;


import java.util.ArrayList;
import java.util.Collections; // for arraylist
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        ArrayList = A resizeable array that stores objects (autoboxing)
//                    Arrays are fixed in size, but Arraylist can change

//               ArrayList<DataType(WrapperClass)> Identifier = new ArrayList<Optional (WrapperCLass)>();
//
//        ArrayList<String> list1 = new ArrayList<String>();
//        ArrayList<Double> list2 = new ArrayList<>();
//        ArrayList<String> fruits = new ArrayList<>();
//
//
//
//        //for list 1
//        list1.add("Neil");
//        list1.add("Wayne");
//        list1.add("Cruz");
//
//        //for list 2
//        list2.add(1.043);
//        list2.add(2.50);
//        list2.add(3.14);
//
//        //for list fruits
//        fruits.add("Apple");
//        fruits.add("Banana");
//        fruits.add("Orange");
//        fruits.add("Grape");
//
//
//        System.out.println("List1: " + list1);
//        System.out.println();
//        System.out.println("List2: " + list2);
//        System.out.println();
//        System.out.println("Fruits: " + fruits);
//        System.out.println(fruits.get(1));
//        System.out.println(fruits.size());
//
//        Collections.sort(fruits);
//
//        System.out.println("Fruits in sorted: " + fruits);

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the NUMBER of food you want: ");
        int numOfFoods = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        for(int i = 0; i < numOfFoods; i++) {
            System.out.print("Enter the food #" + (i + 1) + ": ");
            foods.add(scanner.nextLine());
        }

        System.out.println();
        System.out.println("Foods you like are: " + foods);



        scanner.close();
    }
}
