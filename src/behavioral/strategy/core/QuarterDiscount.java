package behavioral.strategy.core;

public class QuarterDiscount implements Promote {
    @Override
    public double doDiscount(double price) {
        return price*0.75;
    }

    @Override
    public String toString() {
        return "QuarterDiscount";
    }
}
