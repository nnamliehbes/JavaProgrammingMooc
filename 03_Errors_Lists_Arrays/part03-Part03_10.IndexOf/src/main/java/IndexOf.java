
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number

        System.out.println("Search for?");
        int search = scanner.nextInt();

        int i = 0;
        while(i < list.size()) {
            int current = list.get(i);
            if ( current == search) {
                System.out.println(search + " is at index " + i);
            }
            i++;
        }
    }
}
