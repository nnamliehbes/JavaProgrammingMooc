
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        int sum = first + second;
        int diff = first - second;
        int mult = first * second;
        double qout = first / (second * 1.0); 

        System.out.println(first + " + " + second + " = " + sum);
        System.out.println(first + " - " + second + " = " + diff);
        System.out.println(first + " * " + second + " = " + mult);
        System.out.println(first + " / " + second + " = " + qout);
    }
}