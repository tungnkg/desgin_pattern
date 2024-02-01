package structural.decorator.deco;

import structural.decorator.base.IMilkTea;
import structural.decorator.base.MilkTeaDecorator;

public class BlackSugar extends MilkTeaDecorator {
    public BlackSugar(IMilkTea wrap) {
        super(wrap);
    }

    @Override
    public double cost() {
        return getMilkTea().cost() + 2;
    }
}
