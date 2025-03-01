package JavaProgrammingAct;

import java.util.Scanner;

public class CashDenomination {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int num = scanner.nextInt();

        int[] cashDenomination = {1000, 500, 100, 50, 20, 10, 5, 1};

        System.out.println("Cash Denomination: ");

        for(int i = 0; i < cashDenomination.length; i++) {
            int count = num / cashDenomination[i]; // 7
            num = num % cashDenomination[i];//  74
            System.out.println(cashDenomination[i] + " : " + count);
//            if (count > 0) {
//                System.out.println(cashDenomination[i] + " : " + count);
//            }
        }
    }

}
