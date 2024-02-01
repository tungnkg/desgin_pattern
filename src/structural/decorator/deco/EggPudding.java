package structural.decorator.deco;

import structural.decorator.base.IMilkTea;
import structural.decorator.base.MilkTeaDecorator;

public class EggPudding extends MilkTeaDecorator {
    public EggPudding(IMilkTea wrap) {
        super(wrap);
    }

    @Override
    public double cost() {
        return getMilkTea().cost() + 3;
    }
}
