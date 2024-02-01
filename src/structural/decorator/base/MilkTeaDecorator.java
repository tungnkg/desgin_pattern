package structural.decorator.base;

public abstract class MilkTeaDecorator implements IMilkTea{
    private IMilkTea milkTea;

    protected MilkTeaDecorator(IMilkTea wrap){
        this.milkTea = wrap;
    }

    protected IMilkTea getMilkTea() {
        return milkTea;
    }

    @Override
    public abstract double cost();
}
