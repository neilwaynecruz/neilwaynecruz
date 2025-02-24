package HangManGame;

import jdk.jfr.Name;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) {
                                            //Java Hangman Game

        String filePath = "C:\\JAVA-OOP\\oopInJava\\src\\HangManGame\\words.txt";
        ArrayList<String> words = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("An error occurred");
        }
/*



 */
        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));

        Scanner scanner = new Scanner(System.in);

        System.out.println("***********************");
        System.out.println("Welcome to Hangman Game");
        System.out.println("***********************");

        ArrayList<Character> wordState = new ArrayList<>();
        int numWrongGuesses = 0;

        for(int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

            while(numWrongGuesses < 6){
                System.out.println("Number of wrong guesses: " + numWrongGuesses);
                System.out.print("Word: ");

                for(char c : wordState) {
                    System.out.print(c + " ");
                }
                System.out.println();

                System.out.print("Guess a letter: ");
                char guess = scanner.next().toLowerCase().charAt(0);

                if (word.indexOf(guess) >= 0){
                    System.out.println("Correct guess!");
                    for (int i = 0; i < word.length(); i++) {
                        if (word.charAt(i) == guess) {  // this loop is to check if the guessed letter is in the word
                            wordState.set(i, guess);
                        }
                    }
                    if (!wordState.contains('_')) {
                        System.out.println(getHangmanArt(numWrongGuesses));
                        System.out.println("You won!");
                        System.out.println("The word was: " + word);
                        break;
                    }
                }
                else {
                    System.out.println("Incorrect guess!");
                    numWrongGuesses++;
                }
                System.out.println(getHangmanArt(numWrongGuesses));
            }

        if(numWrongGuesses >= 6) {
            System.out.println(getHangmanArt(numWrongGuesses));
            System.out.println("GAME OVER!");
            System.out.println("The word was: " + word);
        }
        scanner.close();
    }

    @Name("getHangmanArt")
    static String getHangmanArt(int numWrongGuesses) {
        return switch (numWrongGuesses){
            case 0 -> """


                      """;
            case 1 -> """
                       o


                      """;
            case 2 -> """
                       o
                       |

                      """;
            case 3 -> """
                       o
                      /|

                      """;
            case 4 -> """
                       o
                      /|\\

                      """;

            case 5 -> """
                       o
                      /|\\
                      /

                      """;
            case 6 -> """
                       o
                      /|\\
                      / \\

                      """;

            default -> "";
        };
    }
}
