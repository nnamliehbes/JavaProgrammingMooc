
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {

            System.out.println("Give a number: ");
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            }

            count = count + 1;
            sum = sum + input;

        }

        double average = sum / (count*1.0);

        System.out.println("Average of the numbers: " + average);


    }
}
