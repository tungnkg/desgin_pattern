package structural.decorator.deco;

import structural.decorator.base.IMilkTea;
import structural.decorator.base.MilkTeaDecorator;

public class Bubble extends MilkTeaDecorator {
    public Bubble(IMilkTea wrap) {
        super(wrap);
    }

    @Override
    public double cost() {
        return getMilkTea().cost() + 1;
    }
}
