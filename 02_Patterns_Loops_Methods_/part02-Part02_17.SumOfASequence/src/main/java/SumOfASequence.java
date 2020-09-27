
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int end = scanner.nextInt();
        int i = 0;
        int sum = 0;
        while (i <= end){
            sum = sum + i;
            i++;
        }
        System.out.println("The sum is " + sum);
    }
}
