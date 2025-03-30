package REVIEW;

import java.util.Arrays;

public class Summation {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("\nThe sum of array(" + Arrays.toString(arr1) + ") is: " + summation(arr1));
        
    }
    
    public static int summation(int[] arr1) {

        int sum = 0;

        for(int num : arr1) {
            sum += num;
        }
        return sum;
    }
}
