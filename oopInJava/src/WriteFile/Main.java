package WriteFile;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        // How to write file using java (4 popular options)

        // FileWriter        = Good for small or medium-sized text files
        // BufferedWriter    = Better performance for large amounts of text
        // PrintWriter       = Best for structured data, like reports or logs
        // FileOutputStream  = Best for binary files (e.g., images, audio files)

        String filePath = "C:\\JAVA-OOP\\oopInJava\\src\\WriteFile\\test.txt";
        String text = """
                                      
                                      "Our deepest fear is not that we are inadequate. Our 
                                      deepest fear is that we are powerful beyond measure." 
                                      - Marianne Williamson.
                      """;

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(text);
            System.out.println("File has been written something");
        }
        catch (FileNotFoundException e){
            System.out.println("File not found in the directory you've set");
        }
        catch(IOException e){
            System.out.println("Something went Wrong");
        }
    }
}
