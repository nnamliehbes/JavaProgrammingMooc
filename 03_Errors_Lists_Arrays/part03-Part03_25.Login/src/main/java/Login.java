
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        String userOneName = "alex";
        String userOnePassword = "sunshine";

        String userTwoName = "emma";
        String userTwoPassword = "haskell";

        if(username.equals(userOneName) && password.equals(userOnePassword)){
            System.out.println("You have successfully logged in!");
        } else if (username.equals(userTwoName) && password.equals(userTwoPassword)) {
            System.out.println("You have successfully logged in!");   
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
