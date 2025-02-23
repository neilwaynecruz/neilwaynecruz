package ReadFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // How to read a file using java (3 popular options)

        // BufferedReader + FileReader  = best for reading text line by line
        // FilesInputStream             = best for reading binary data/files (images, videos, audio, etc)
        // RandomAccessFile             = best for read/write specific portion of a large file

        String filePath = "C:\\JAVA-OOP\\oopInJava\\src\\ReadFile\\Test.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("Something Went Wrong: " + e.getMessage());
        }


    }


}
