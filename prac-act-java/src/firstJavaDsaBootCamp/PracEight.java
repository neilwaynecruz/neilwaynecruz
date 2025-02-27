package firstJavaDsaBootCamp;

import java.util.Scanner;

public class PracEight {
    public static void main(String[] args) {

        //To find out whether the given String is Palindrome or not.

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        boolean isPalindrome = true;

        word = palindrome(word.toLowerCase());

        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println("It is palindrome");
        }
        else {
            System.out.println("It is not palindrome");
        }

        scanner.close();
    }

    static String palindrome(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        System.out.println("Reverse: " + reverse);
        return reverse;
    }
}