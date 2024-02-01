package structural.decorator.deco;

import structural.decorator.base.IMilkTea;
import structural.decorator.base.MilkTeaDecorator;

public class FruitPudding extends MilkTeaDecorator {
    public FruitPudding(IMilkTea wrap) {
        super(wrap);
    }

    @Override
    public double cost() {
        return getMilkTea().cost() + 3;
    }
}
