package Programs;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        // array = a collection of values that are all of the same data type
        //         and are stored in contiguous (joint) memory locations.
        //         think of it as a variable that can hold multiple values (as long as it has the same data type)
        //         and you can access those values by referring to an index number.

        // declaring an array
        // dataType[] arrayName;
        // dataType arrayName[];
        // or dataType[] arrayName = {value0, value1, value2, ...};
        // or dataType[] arrayName = new dataType[size];

        String[] cars = {"Camaro", "Corvette", "Tesla"};
        String[] fruits = {"Apple", "Banana", "Orange", "Blueberry", "Strawberry"};

        cars[0] = "Mustang";
        fruits[0] = "Kiwi";

        Arrays.sort(cars);
        Arrays.sort(fruits);
        
      /*   for (int i = 0; i < cars.length; i++) {                  for loop
            for (int j = 0; j < fruits.length; j++) {
                System.out.println(cars[i] + " " + fruits[j]);
            }
        }
*/

        for (String car: cars){ //                                  for each loop (enhanced for loop)
            System.out.print(car + " ");
        }
        System.out.println();

        for (String fruit: fruits){//                                  for each loop (enhanced for loop)
            System.out.print(fruit + " ");
        }
        System.out.println("\n");
    }
    
}
