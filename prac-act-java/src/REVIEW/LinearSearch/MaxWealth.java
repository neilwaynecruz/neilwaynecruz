package REVIEW.LinearSearch;

public class MaxWealth {
    public static void main(String[] args) {

        int[][] accounts = {
            {1,5},
            {7,3},
            {3,5}
        };

        System.out.println("Maximum Wealth is: " + maximumWealth(accounts));
        
    }
    static int maximumWealth(int[][] accounts){
        int maxWealth = 0;

        for(int[] acc : accounts){
            int wealth = 0;
            for(int balance : acc){
                wealth += balance;
            }
            maxWealth = Math.max(maxWealth, wealth);
        }
        return maxWealth;
    }
}
