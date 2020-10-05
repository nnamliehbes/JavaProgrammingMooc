
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matthew = new Account("Matthews account", 1000.00);
        Account mine = new Account("My account", 0.00);

        matthew.withdrawal(100.00);
        mine.deposit(100.00);

        System.out.println(matthew);
        System.out.println(mine);
    }
}
