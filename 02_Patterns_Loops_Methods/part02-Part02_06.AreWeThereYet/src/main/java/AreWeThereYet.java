
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Give a number:");
            int number = scanner.nextInt();
            if (number == 4) {
                break;
            }
        }
    }
}
