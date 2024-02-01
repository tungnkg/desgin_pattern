package behavioral.strategy.core;

public class NoDiscount implements Promote {
    @Override
    public double doDiscount(double price) {
        return price;
    }

    @Override
    public String toString() {
        return "NoDiscount";
    }
}
