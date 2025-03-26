package REVIEW;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PassingArrayToFunction {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8};
        System.out.println("       " + Arrays.toString(nums));
        System.out.println("index:  0  1  2  3  4  5  6  7");

        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter an index you want to swap:");
        int index1 = in.nextInt();
        int index2 = in.nextInt();

        swap(nums,index1,index2);

        System.out.println(Arrays.toString(nums));

        in.close();

    }

    static void swap(int[]nums,int index1,int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
        System.out.println("SWAPPED");
        System.out.println();
    }


}
