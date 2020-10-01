
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int end = scanner.nextInt();

        int i = 1;
        int product = 1;
        
        while (i <= end){
            product = product * i;
            i++;
        }
        System.out.println("Factorial: " + product);

    }
}
