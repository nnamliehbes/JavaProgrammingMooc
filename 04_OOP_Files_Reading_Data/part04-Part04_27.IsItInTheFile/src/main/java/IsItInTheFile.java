
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        int founds = 0;
        try(Scanner fileReader = new Scanner(Paths.get(file))) {

            while(fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                if (row.equals(searchedFor)) {
                    founds = founds + 1;
                } 
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        if (founds == 0) {
            System.out.println("Not found.");
        } else {
            System.out.println("Found!");
        }

    }
}
