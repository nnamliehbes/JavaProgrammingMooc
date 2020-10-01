
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }

            String[] all = input.split(" ");
            for(String text : all){
                if(text.contains("av")){
                    System.out.println(text);
                }
            }
        }

    }
}
