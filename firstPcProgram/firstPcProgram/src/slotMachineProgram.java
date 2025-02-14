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

            userCurrentBalance = validateBet(userBet, userCurrentBalance);
            if (userCurrentBalance == -1) {
                continue; 
            }

            System.out.println("\nSpinning the slot machine...");
            row = spinSlots();
            printRow(row);
            userWinning = calculatePayout(row, userBet);

            userCurrentBalance = updateBalanceAfterWin(userWinning, userCurrentBalance);

            System.out.print("Do you want to continue playing? [y/n]: ");
            userChoice = scanner.next().toLowerCase().charAt(0);
            System.out.println("");

            if (userChoice == 'n') {
                break;
            }
        }

        System.out.printf("Thank you for playing! Your final balance is: P %.2f%n", userCurrentBalance);
        scanner.close(); 
    }

    static void printOpeningMessage() {
        System.out.println("--------------------------------");
        System.out.println("Welcome to the Slot Machine Game!");
        System.out.println("Symbols: [7, $, #, @, *, ^]");
        System.out.println("--------------------------------\n");
    }

    static double validateBet(double userBet, double userCurrentBalance) {
        if (userBet > userCurrentBalance) {
            System.out.println("Insufficient balance! Please enter a valid bet.\n");
            return -1;
        } else if (userBet <= 0) {
            System.out.println("Invalid bet amount! Bet must be greater than 0.\n");
            return -1;
        }
        return userCurrentBalance - userBet;
    }

    static String[] spinSlots() {
        String[] symbols = {"7", "$", "#", "@", "*", "^"};
        String[] spinRow = new String[3];

        for (int i = 0; i < spinRow.length; i++) {
            spinRow[i] = symbols[random.nextInt(symbols.length)];
        }
        return spinRow;
    }

    static void printRow(String[] row) {
        System.out.println("---------------------------");
        System.out.print("\t");
        System.out.println(String.join(" | ", row));
        System.out.println("---------------------------\n");
    }

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
