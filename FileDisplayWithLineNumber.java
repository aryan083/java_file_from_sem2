import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDisplayWithLineNumber {
    public static void main(String[] args) {
        String filename = "D:/ELDEN RING/regulation.bin"; // Specify the file name

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                System.out.printf("%d: %s\n", lineNumber, line);
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
