
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String file = scanner.nextLine();

        try(Scanner scannerNew = new Scanner(Paths.get(file))) {

            while(scannerNew.hasNextLine()) {
                String row = scannerNew.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
