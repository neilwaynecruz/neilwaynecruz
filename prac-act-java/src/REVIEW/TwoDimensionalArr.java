package REVIEW;

import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Scanner;

public class TwoDimensionalArr {
    public static void main(String[] args) {

        // Scanner in = new Scanner(System.in);
//
//        int[][] nums = new int[3][3];
//
//        for(int i=0; i<nums.length; i++){
//            for(int j=0; j<nums[i].length; j++){
//                nums[i][j] = in.nextInt();
//            }
//        }
//
//        System.out.println();
//
//        for(int[] a: nums){
//            Arrays.sort(a);
//            for(int b: a){
//                System.out.print(b + " ");
//            }
//            System.out.println();
//        }


        // arraylist

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(123);
        nums.add(456);
        nums.add(789);
        nums.add(123);
        nums.add(456);
        nums.add(789);

        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }



    }
}
