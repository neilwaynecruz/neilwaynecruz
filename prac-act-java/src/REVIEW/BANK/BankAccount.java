package REVIEW.BANK;

public class BankAccount {
    private double currentBalance;

     BankAccount(double currentBalance){
        this.currentBalance = currentBalance;
    }

  public void checkBalance(){
        System.out.println("Current balance = " + this.currentBalance);
    }

    public void withdraw(double amount) {
        if (amount > this.currentBalance) {
            System.out.println("Insufficient funds");
        }
        else if (amount < 0) {
            System.out.println("Invalid amount, amount can't be NEGATIVE!!");
        }
        else {
            this.currentBalance -= amount;
            System.out.println("Withdrawal successful");
        }
    } // end of withdraw

     public void deposit(double amount){
        if (amount < 0) {
            System.out.println("Invalid amount, amount can't be NEGATIVE!!");
        }
        else {
            this.currentBalance += amount;
            System.out.println("Deposit successful");
        }
    } // end of deposit
}
