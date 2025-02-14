import java.util.*;

public class slotMachineProgram {
    static Scanner scanner = new Scanner(System.in); 
    static Random random = new Random(); 

    public static void main(String[] args) {
        double userCurrentBalance = 100; 
        double userBet = 0; 
        char userChoice; 
        double userWinning; 
        String[] row;

        printOpeningMessage();

        while (userCurrentBalance > 0) { 
            System.out.printf("Your current balance is: P %.2f%n", userCurrentBalance);
            System.out.print("Enter your bet amount: ");

            if (scanner.hasNextDouble()) {
                userBet = scanner.nextDouble();
            } else {
                System.out.println("Invalid input! Please enter a numeric value.\n");
                scanner.next(); 
                continue;
            }

            userCurrentBalance = validateBet(userBet, userCurrentBalance); // to validate the user's bet if it is valid or not
            if (userCurrentBalance == -1) {
                continue; 
            }

            System.out.println("\nSpinning the slot machine...");
            row = spinSlots(); // Spin the slot machine
            printRow(row); // Print the row of the slot machine
            userWinning = calculatePayout(row, userBet); // Calculate the payout

            userCurrentBalance = updateBalanceAfterWin(userWinning, userCurrentBalance); // Update the balance

            System.out.print("Do you want to continue playing? [y/n]: ");
            userChoice = scanner.next().toLowerCase().charAt(0);
            System.out.println("");

            if (userChoice == 'n') {
                break;
            }
        }

        System.out.printf("Thank you for playing! Your final balance is: P %.2f%n", userCurrentBalance);
        scanner.close(); 
        
    } // end of main method


    // Method to print the opening message
    static void printOpeningMessage() {
        System.out.println("--------------------------------");
        System.out.println("Welcome to the Slot Machine Game!");
        System.out.println("Symbols: [7, $, #, @, *, ^]");
        System.out.println("--------------------------------\n");
    }
    // Method to validate the user's bet
    static double validateBet(double userBet, double userCurrentBalance) {
        if (userBet > userCurrentBalance) {
            System.out.println("Insufficient balance! Please enter a valid bet.\n");
            return -1;
        } else if (userBet <= 0) {
            System.out.println("Invalid bet amount! Bet must be greater than 0.\n");
            return -1;
        } else {
            return userCurrentBalance - userBet;
        }
    }
    
    // Method to spin the slot machine
    static String[] spinSlots() {
        String[] symbols = {"7", "$", "#", "@", "*", "^"};
        String[] spinRow = new String[3];

        for (int i = 0; i < spinRow.length; i++) {
            spinRow[i] = symbols[random.nextInt(symbols.length)];
        }
        return spinRow;
    }
    
    // Method to print the row of the slot machine
    static void printRow(String[] row) {
        System.out.println("---------------------------");
        System.out.print("\t");
        System.out.println(String.join(" | ", row));
        System.out.println("---------------------------\n");
    }
    
    // Method to calculate the payout
    static double calculatePayout(String[] row, double userBet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "7" -> userBet * 3;
                case "$" -> userBet * 6;
                case "#" -> userBet * 9;
                case "@" -> userBet * 12;
                case "*" -> userBet * 15;
                case "^" -> userBet * 20;
                default -> 0;
            };
        } else if (row[0].equals(row[1]) || row[1].equals(row[2])) { 
            return switch (row[1]) {
                case "7" -> userBet * 2;
                case "$" -> userBet * 4;
                case "#" -> userBet * 6;
                case "@" -> userBet * 8;
                case "*" -> userBet * 10;
                case "^" -> userBet * 14;
                default -> 0;
            };
        } else if(row[0].equals(row[2])) {
            return switch (row[0]) {
                case "7" -> userBet * 2;
                case "$" -> userBet * 4;
                case "#" -> userBet * 6;
                case "@" -> userBet * 8;
                case "*" -> userBet * 10;
                case "^" -> userBet * 14;
                default -> 0;
            };
        }
            return 0;
    }
    
    // Method to update the balance after a win
    static double updateBalanceAfterWin(double userWinning, double userCurrentBalance) {
        if (userWinning > 0) {
            System.out.printf("Congratulations! You won: P %.2f%n%n", userWinning);
            return userCurrentBalance + userWinning;
        } else {
            System.out.println("Better luck next time!\n");
            return userCurrentBalance;
        }
    }
}
