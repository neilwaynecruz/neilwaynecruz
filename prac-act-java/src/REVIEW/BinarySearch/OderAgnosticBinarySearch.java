package REVIEW.BinarySearch;

public class OderAgnosticBinarySearch {
    public static void main(String[] args) {

        //Agnostic means we don't know the order of the array
        //It could be sorted in ascending or descending order

        // int[] arr1 = {-18,-12,-4,0,2,3,4,15,16,18,22}; // for this array, the order is ascending
        int[] arr2 = {16,8,4,2,1,-2,-5,-16,-20}; // for this array, the order is descending
        int target = -20;
        System.out.println(OrderAgnosticBinarySearch(arr2, target));
        
    }

    // for a sorted array but we don't know the order
    // return the index of the target element
    static int OrderAgnosticBinarySearch(int[] arr, int target) {

        if(arr.length == 0) return -1;

        int start = 0;
        int end = arr.length - 1;


        // find whether the array is sorted in ascending or descending order
        boolean isAscending = arr[start] < arr[end];

        
        while(start <= end){
            // find the middle element
            int mid = start + (end - start) / 2; // to avoid integer overflow and to get the middle element of the array continuously


            if(isAscending) // if the array is sorted in ascending order
            {
                if(arr[mid] == target) return mid;
                else if(target > arr[mid]) start = mid + 1; // if target is greater than the middle element, then it must be in the right half, since the array is sorted
                else if(target < arr[mid]) end = mid - 1; // if target is less than the middle element, then it must be in the left half, since the array is sorted
            }
            else // if the array is sorted in descending order
            {
                if(arr[mid] == target) return mid;
                else if(target < arr[mid]) start = mid + 1; // if target is less than the middle element, then it must be in the right half, since the array is sorted in descending order
                else if(target > arr[mid]) end = mid - 1; // if target is greater than the middle element, then it must be in the left half, since the array is sorted in descending order
            }

        } // end of while loop
        return -1;
    }
}
