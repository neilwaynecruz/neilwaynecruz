package REVIEW.BinarySearch;

class BinarySearchAscendingOrder{
    public static void main(String[] args) {

        int[] arr = {-8,-2,1,2,4,8,9,12,18,23,45,67};
        int target = 9;

        if(binarySearch(arr, target) == -1){
            System.out.println(target + " is not in the array");
        }
        else
            System.out.println(target + " is at index: " + binarySearch(arr, target));
    }

    // for a sorted array
    // return the index of the target element
    static int binarySearch(int[] arr, int target){

        if(arr.length == 0) return -1;

        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end){
            // find the middle element
            int mid = start + (end - start) / 2; // to avoid integer overflow and to get the middle element of the array continuously

            if(arr[mid] == target) return mid;
            else if(target > arr[mid]) start = mid + 1; // if target is greater than the middle element, then it must be in the right half, since the array is sorted
            else if(target < arr[mid]) end = mid - 1; // if target is less than the middle element, then it must be in the left half, since the array is sorted
        }
        return -1;
    }
}