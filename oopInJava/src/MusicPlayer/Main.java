package MusicPlayer;
import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // how to play an audio (Supported formats: .wav, .au, .aiff)
        String filepath = "C:\\JAVA-OOP\\oopInJava\\src\\MusicPlayer\\Music1.wav";

        File file = new File(filepath);

        try (Scanner scanner = new Scanner (System.in);
             AudioInputStream audiostream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audiostream);

            String choice = "";

            while(!choice.equalsIgnoreCase("Q")){
                System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
                System.out.print("Enter your choice: ");
                choice = scanner.next().toUpperCase();

                switch (choice){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("Unsupported Audio File: " + e.getMessage());
        }
        catch (LineUnavailableException e){
            System.out.println("Line Unavailable: " + e.getMessage());
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("Program ended");
        }
    }
}
