

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        // Implement the search functionality here
        System.out.println("Search for?");
        int search = scanner.nextInt();

        int i = 0;
        boolean found = false;
        while(i < array.length) {
            if (array[i] == search) {
                System.out.println(search + " is at index " + i + ".");
                found = true;
            }
            i++;
        }
        if (found != true){
            System.out.println(search + " was not found.");
        }
    }
}