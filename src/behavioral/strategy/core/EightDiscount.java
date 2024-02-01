package behavioral.strategy.core;

public class EightDiscount implements Promote {
    @Override
    public double doDiscount(double price) {
        return price*0.2;
    }

    @Override
    public String toString() {
        return "EightDiscount";
    }
}
