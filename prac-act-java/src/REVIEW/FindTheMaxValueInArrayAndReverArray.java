package REVIEW;

import java.util.Arrays;

public class FindTheMaxValueInArrayAndReverArray {
    public static void main(String[] args) {
//
//        int[] nums = {1, 30, 24, 12,700,200,300,400,123,560,250};
//
//        int max = 0;
//        for (int num : nums) {
//            if (num > nums[nums.length - 1]) {
//                max = num;
//                break;
//            } else continue;
//        }
//
//        System.out.println(max);

        int[] nums = {1, 30, 24, 12,700,200,300,400};

        int start = 0;
        int end = nums.length - 1;

        reverse(nums,start,end);

        System.out.println(Arrays.toString(nums));

    }
    static void reverse(int[]nums,int start,int end) {
        for(int i = start; i<nums.length;i++) {
            int temp = nums[i];
            nums[i] = nums[end];
            nums[end] = temp;
            end--;
            if (end < i)
                break;
        }
    }
}
