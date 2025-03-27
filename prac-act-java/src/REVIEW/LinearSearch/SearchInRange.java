package REVIEW.LinearSearch;

public class SearchInRange{
    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 123;

        int start = 2;
        int end = 5;

        System.out.println("\nFound at index: " + searchInRange(arr1, target, start, end));
    }

    static int searchInRange(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for(int i = start; i <= end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}