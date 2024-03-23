package structural.facade;

public class BankAccount {
    private final String accountName;
    private final int securityCode;

    private final AccountChecker accountChecker;
    private final SecurityChecker securityChecker;
    private final ManagerAccount managerAccount;

    public BankAccount(String accountName, int securityCode) {
        this.accountName = accountName;
        this.securityCode = securityCode;

        this.accountChecker = new AccountChecker(accountName);
        this.securityChecker = new SecurityChecker(securityCode);
        this.managerAccount = new ManagerAccount(1000.00);
    }

    public void deposit(double cashAmount){
        if(accountChecker.isValid(accountName) && securityChecker.isValid(securityCode)){
            managerAccount.deposit(cashAmount);
            System.out.println("Xong roi");
            System.out.println("Total Money: " + this.managerAccount.get());

        }else {
            System.out.println("Hong be oi");
        }
    }

    public void withdraw(double cashAmount){
        if(accountChecker.isValid(accountName)
                && securityChecker.isValid(securityCode)
                && managerAccount.haveEnoughMoney(cashAmount)
        ){
            managerAccount.withdraw(cashAmount);
            System.out.println("Xong roi");
            System.out.println("Total Money: " + this.managerAccount.get());
        }else {
            System.out.println("Hong be oi");
        }
    }

}
