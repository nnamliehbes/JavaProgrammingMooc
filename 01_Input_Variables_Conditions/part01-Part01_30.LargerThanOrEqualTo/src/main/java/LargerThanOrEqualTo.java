
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Give the first number:");
        int numberOne = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give the second number");
        int numberSecond = Integer.valueOf(scan.nextLine());
        
        if (numberOne > numberSecond) {
            System.out.println("Greater number is:" + numberOne);
        } else if (numberSecond > numberOne) {
            System.out.println("Greater number is:" + numberSecond);
        } else if (numberOne == numberSecond) {
            System.out.println("The numbers are equal!");
        }
    }
}
