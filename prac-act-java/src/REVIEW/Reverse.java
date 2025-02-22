package REVIEW;

public class Reverse {
    public static void main(String[] args) {

        int n = 12345;
        int ans = 0;

        while (n > 0){ // 123
            int rem = n % 10; // 3
            n = n / 10; // 12
            ans = ans * 10 + rem; // 543
        }

        System.out.println(ans);

    }
}
