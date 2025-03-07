package REVIEW;

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        if (isPangram(sentence)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is NOT a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        String lowerCaseSentence = sentence.toLowerCase();
        boolean[] alphabetFlags = new boolean[26];

        for (char c : lowerCaseSentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                alphabetFlags[c - 'a'] = true;
            }
        }
        for (boolean flag : alphabetFlags) {
            if (!flag) {
                return false;
            }
        }
        return true;
    }
}
