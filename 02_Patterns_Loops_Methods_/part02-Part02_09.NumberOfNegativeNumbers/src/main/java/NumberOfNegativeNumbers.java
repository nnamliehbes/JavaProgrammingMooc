
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while (true ){

            System.out.println("Give a number: ");
            int input = scanner.nextInt();

            if (input > 0) {
                continue;
            } 
            
            if (input == 0) {
                break;
            }

            count++;
        }

        System.out.println("Number of negative numbers: " + count);
    }
}
