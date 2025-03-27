package REVIEW.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr1 = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int target = 12;
        int[] result = searchIn2DArray(arr1, target);
        System.out.println("\nTarget found at [row,col]: " + Arrays.toString(result));
    }

    static int[] searchIn2DArray(int arr1[][], int target){
        for(int i = 0; i < arr1.length;i++){ // start of outer loop for row
            for(int j = 0; j<arr1[i].length;j++){ // start of inner loop for coloumn
                if(arr1[i][j] == target){
                    return new int[]{i,j}; // return the row and coloumn index
                }
            } // end of inner loop
        } // end of outer loop

        return new int[]{-1,-1}; // return -1,-1 if target not found
    }
}
