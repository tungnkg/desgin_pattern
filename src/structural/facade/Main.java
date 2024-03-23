package structural.facade;

public class Main {
    public static void main(String[] args) {
        BankAccount  bankAccount = new BankAccount("9347204560", 270503);
        bankAccount.deposit(5000.00);
        bankAccount.withdraw(1000.00);

    }
}
