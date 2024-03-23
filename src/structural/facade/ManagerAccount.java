package structural.facade;

public class ManagerAccount {
    private double totalMoney;

    public ManagerAccount(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public double get(){
        return this.totalMoney;
    }
    public boolean haveEnoughMoney(double cashMoney){
        return totalMoney >= cashMoney;
    }

    void deposit(double cashMoney){
        totalMoney += cashMoney;
    }

    void withdraw(double cashMoney){
        totalMoney -= cashMoney;
    }
}
