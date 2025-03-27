package REVIEW.LinearSearch;

public class MinNumSearch {
    public static void main(String[] args) {
        int[] arr1 = {2,4,6,-8,10,-12,14,-24,30};
        System.out.println("\nMin number is: " + minNum(arr1));
    }

    static int minNum(int[] arr1){
       if (arr1.length == 0){
           return Integer.MIN_VALUE;
       }

       int min = arr1[0];
       for(int i = 0; i < arr1.length; i++){
            if(arr1[i] < min){
                min = arr1[i];
            }
       }
       return min;
    }
}
