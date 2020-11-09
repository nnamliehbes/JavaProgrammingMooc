import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while(true) {
            System.out.println("Command: ");
            String input = this.scanner.nextLine();

            if(input.equals("stop")) {
                break;
            }

            if(input.equals("add")) {
                System.out.println("To add: ");
                String text = this.scanner.nextLine();

                this.list.add(text);
            }

            if(input.equals("list")) {
                this.list.print();
            }

            if (input.equals("remove")) {
                int toRemove = Integer.valueOf(scanner.nextLine());
                this.list.remove(toRemove);
            }
        }
    }
}
