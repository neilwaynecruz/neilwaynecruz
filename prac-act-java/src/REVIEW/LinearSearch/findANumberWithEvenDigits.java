package REVIEW.LinearSearch;

public class findANumberWithEvenDigits {
    public static void main(String[] args) {
        int[] arr = {1, 12, 123, 1234, 12345, 123456, 1234567, 12345678};
        System.out.println(findNumberIfEven(arr)); 
    }

    // Function to find the number of elements with even digits
    static int findNumberIfEven(int[] arr) {
        int evenDigitCount = 0;
        for (int num : arr) { 
            if (countNumOfDigits(num)) { // Check if the number has even digits
                evenDigitCount++;
            }
        }
        return evenDigitCount;
    }

    // Function to check if the number has even digits or not
    static boolean countNumOfDigits(int num) {
        num = Math.abs(num); // Convert to positive

        // If num == 0, handle separately
        if (num == 0) return false; // (Optional) Zero has 1 digit, which is odd.

        return ((int) Math.log10(num) + 1) % 2 == 0; // Check if digit count is even
    }
}
