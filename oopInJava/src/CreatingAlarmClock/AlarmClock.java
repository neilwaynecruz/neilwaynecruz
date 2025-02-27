package CreatingAlarmClock;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable {

    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;

    AlarmClock(LocalTime alarmTime, String filePath, Scanner scanner) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner = scanner;
    }

    @Override
    public void run() {
        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                LocalTime now = LocalTime.now();

                System.out.printf("\r%02d:%02d:%02d" , now.getHour(), now.getMinute(), now.getSecond());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
                return;
            }
        }
        System.out.println("\n");
        System.out.println("⏰ ALARM! Time reached: " + alarmTime);
        playSound(this.filePath);

    }

    private void playSound(String filePath) {

        File audioFile = new File(filePath);


        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)){
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            System.out.print("Press 'ENTER' to stop the alarm: ");
            scanner.nextLine();
            clip.stop();
            this.scanner.close();
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported audio file");
        }catch (LineUnavailableException e) {
            System.out.println("Line unavailable");
        }
        catch (IOException e) {
            System.out.println("Error reading audio file");
        }
    }
}
