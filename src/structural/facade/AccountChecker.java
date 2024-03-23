package structural.facade;

import java.util.Objects;

public class AccountChecker {
    private final String accountName;

    public AccountChecker(String accountName) {
        this.accountName = accountName;
    }

    public boolean isValid(String accountName){
        return Objects.equals(this.accountName, accountName);
    }
}
