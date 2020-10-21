
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Item> archive = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.println("Idntifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }
    
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }

            Item item = new Item(id, name);

            if(!archive.contains(item)) {
                archive.add(item);
            }
        }

        System.out.println("==Items==");
        for (Item item : archive) {
            System.out.println(item);
        }

    }
}
