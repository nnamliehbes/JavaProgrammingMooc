
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.valueOf(scanner.nextLine());
        int numberSecond = Integer.valueOf(scanner.nextLine());

        double sSum = Math.sqrt(numberOne + numberSecond);

        System.out.println(sSum);
    }
}
