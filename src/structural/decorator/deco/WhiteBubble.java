package structural.decorator.deco;

import structural.decorator.base.IMilkTea;
import structural.decorator.base.MilkTeaDecorator;

public class WhiteBubble extends MilkTeaDecorator {
    public WhiteBubble(IMilkTea wrap) {
        super(wrap);
    }

    @Override
    public double cost() {
        return getMilkTea().cost() + 1.5;
    }
}
