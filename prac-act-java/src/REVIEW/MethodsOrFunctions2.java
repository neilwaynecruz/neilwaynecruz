package REVIEW;

import java.util.Arrays;

public class MethodsOrFunctions2 {
    public static void main(String[] args) {

        String name = "NEIL WAYNE";

        name = changeName(name); // "NEIL WAYNE and Iron Man!"

        System.out.println("Hello " + name + "!");

        int [] nums = {10, 20, 30, 40, 50};
        System.out.println(nums.length);
        changeNums(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void changeNums(int numbers[]){
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
    }

    static String changeName(String name) {
        return name + " and " + "Iron Man";
    }

    static String sayHello() {
        return "Hello";
    }

}
