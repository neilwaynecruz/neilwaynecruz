package HashMaps;


import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        HashMap = A data structure that stores key-value pairs.
//                  Keys are unique, but values can be duplicated
//                  does not maintain any order, but is memory efficient
//                  HashMap<Key, Value>.

// Declaration:

        HashMap<String, Double> map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements you want to add in the map: ");
        int n = scanner.nextInt();

        for(int i=0; i<n; i++){
            System.out.print("Enter the key Product: ");
            String key = scanner.next();
            System.out.print("Enter the value of Key Product: ");
            double value = scanner.nextDouble();
            map.put(key, value);
            System.out.println();
        }

//      Adding elements:
//
//
//        map.remove("Apple");
//
//        System.out.println(map.containsKey("Apple"));
//        System.out.println(map.containsValue(20.00));
//
//        if(map.containsKey("Apple")){
//            System.out.println("Apple is present in the map");
//        }else{
//            System.out.println("Apple is not present in the map");
//        }
//
//        System.out.println(map.size());

            for(String key: map.keySet()){
            System.out.printf("%s : %.2f\n", key, map.get(key));
        }


    }
}
