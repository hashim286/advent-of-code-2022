import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PartTwo {
    public static void main(String[] args) {
        String path = "text.txt";


        try (Scanner scanner = new Scanner(Paths.get(path))) {
            int counter = 0;
            while (scanner.hasNextLine()) {
                String lineOne = scanner.nextLine();
                String lineTwo = scanner.nextLine();
                String lineThree = scanner.nextLine();

            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}