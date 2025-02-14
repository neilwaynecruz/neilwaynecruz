import java.util.*; // Importing the util package

public class rockPaperScissors {

    static Scanner scanner = new Scanner(System.in); // Creating a scanner object  to take input from the user
    public static void main(String[] args) {

        Random random = new Random(); // Creating a random object to generate random numbers
        String userMove = ""; // Variable to store the user's move
        int userScore = 0; // Variable to store the user's score
        String userChoice = ""; // Variable to store the user's choice
        String computerMove = ""; // Variable to store the computer's move

        System.out.println("--------------------------------------");
        System.out.println("Welcome to Rock, Paper, Scissors game!");
        System.out.println("--------------------------------------");
        System.out.println();

        do {
                userMove = inputMove(); // Taking the user's move as input

                String[] moves = {"ROCK", "PAPER", "SCISSORS"}; // Array to store the possible moves
                computerMove = moves[random.nextInt(moves.length)]; // Getting the computer's move

                System.out.println("Computer's move: " + computerMove); // Printing the computer's move

                userScore = condition(userMove, computerMove, userScore); // Checking the condition of the game

                System.out.println();
                System.out.println("Your total score: " + userScore); // Printing the user's score
                System.out.println();
                System.out.print("Try again? [yes/no]: "); // Asking the user if they want to play again
                userChoice = scanner.nextLine().toLowerCase(); // Taking the user's choice as input and converting it to lowercase
                System.out.println();

            } while (userChoice.equalsIgnoreCase("yes")); // Loop to keep the game running until the user's score reaches 3

            scanner.close(); // Closing the scanner object
            //end of the program
    }


    // to input the move of the user
    static String inputMove() {

        System.out.print("Enter you move (rock, paper, scissors): ");
        String userMove = scanner.nextLine();
        if (!userMove.equalsIgnoreCase("rock") && !userMove.equalsIgnoreCase("paper")
             && !userMove.equalsIgnoreCase("scissors")) {
            System.out.println("Invalid move! Please enter a valid move.");
            System.out.println();
            return inputMove();
        }
        else{
            return userMove;
        }

    }

    // method to check the condition of the game
    static int condition(String userMove, String computerMove, int userScore) {
        if (userMove.equalsIgnoreCase(computerMove) ) {
            System.out.println("IT'S A TIE!");
            return userScore;
        } else if ( userMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("scissors") ) {
            System.out.println("YOU WIN!");
            return userScore = userScore + 1;
        } else if ( userMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("rock") ) {
            System.out.println("YOU WIN!");
            return userScore = userScore + 1;
        } else if ( userMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("paper") ) {
            System.out.println("YOU WIN!");
            return userScore = userScore + 1;
        } else {
            System.out.println("YOU LOSE!");
            return userScore;
        }
    }
}