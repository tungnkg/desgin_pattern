package behavioral.strategy.core;

public class HalfDiscount implements Promote {
    @Override
    public double doDiscount(double price) {
        return price*0.5;
    }

    @Override
    public String toString() {
        return "HalfDiscount";
    }
}
