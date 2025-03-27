package REVIEW.LinearSearch;

public class MaximumNumin2DArray {
    public static void main(String[] args) {
        int[][] arr1 = {
            {1,2,3,4},
            {5,6,7,456},
            {9,800,11,123},
            {13,14,15,16}
        };
        System.out.println("\nMax number is: " + maxNum(arr1));
    }

    static int maxNum(int[][] arr1){

        int max = arr1[0][0]; // let's assume that first element is the max value

        for(int i = 0; i < arr1.length;i++){ // start of outer loop for row
            for(int j = 0; j<arr1[i].length;j++){ // start of inner loop for coloumn
                if(arr1[i][j] > max){
                    max = arr1[i][j];
                }
            } // end of inner loop
        } // end of outer loop

        return max;
    }
    
}
