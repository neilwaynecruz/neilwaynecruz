package REVIEW;

import java.util.Scanner;

public class RomanNumerals {
    public int romanToInt(String s) {
        int ans = 0;
        int num = 0;

        for(int i = s.length() - 1; i>= 0; i--){
            char ch = s.charAt(i);
            if(ch == 'I') num = 1;
            else if(ch == 'V') num = 5;
            else if(ch == 'X') num = 10;
            else if(ch == 'L') num = 50;
            else if(ch == 'C') num = 100;
            else if(ch == 'D') num = 500;
            else if(ch == 'M') num = 1000;

            if(num * 4 < ans) ans -= num;
            else ans += num;
        }

        return ans;
    }
    
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        RomanNumerals solution = new RomanNumerals();
        System.out.println(solution.romanToInt(scanner.nextLine().toUpperCase()));
    }
}
