package structural.facade;

import java.util.Objects;

public class SecurityChecker {
    private final int securityCode;

    public SecurityChecker(int securityCode) {
        this.securityCode = securityCode;
    }

    public boolean isValid(int securityCode){
        return this.securityCode == securityCode;
    }
}
