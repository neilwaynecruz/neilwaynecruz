package REVIEW;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().toLowerCase();
        String word2 = scanner.nextLine().toLowerCase();

        if (word.length() != word2.length()) {
            System.out.println("Not Anagram");
        } else {
            int count = anagram(word, word2);
            if (count == word.length()) {
                System.out.println("It is Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }

        scanner.close();
    }

    public static int anagram(String word, String word2) {
        int count = 0;
        boolean[] used = new boolean[word2.length()]; // To tract used letters and the default value is false

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {
                if (word.charAt(i) == word2.charAt(j) && !used[j]) {
                    count++; //
                    used[j] = true; // Mark letter as used
                    break; // Move to the next letter in word
                }
            }
        }
        return count;
    }
}




//[0] = f , [1] = f , [2] = f  , [3] = f, [4] = f, [5] = f, [6] = f , [7] = tf , [8] = f , [9] = f, [10] = f, [11] = f,
