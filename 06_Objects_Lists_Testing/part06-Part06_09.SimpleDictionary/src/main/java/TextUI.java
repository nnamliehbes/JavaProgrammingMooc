import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict){
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start() {

        while (true) {
            System.out.println("Command: ");
            String input = this.scanner.nextLine();
    
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (input.equals("add")) {
                System.out.println("Word: ");
                String word = this.scanner.nextLine();

                System.out.println("Translation: ");
                String translation = this.scanner.nextLine();

                this.dict.add(word, translation);
            }

            if (input.equals("search")) {
                System.out.println("To be translated: ");
                String searched = scanner.nextLine();

                if (this.dict.translate(searched) == null) {
                    System.out.println("Word " + searched + " was not found");
                } else {
                    System.out.println("Translation: " + this.dict.translate(searched));
                }
            }

            System.out.println("Unknown command");

        }




    }

}
