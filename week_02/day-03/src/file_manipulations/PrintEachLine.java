package file_manipulations;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        try {
            Path filePath = Paths.get("src/my-file.txt");
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (Exception exception) {
            System.out.println("Unable to read file: my-file.txt");
        }
    }
}
