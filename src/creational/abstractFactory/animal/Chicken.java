package creational.abstractFactory.animal;

public class Chicken extends TwoLegAnimal{
    @Override
    public void getName() {
        System.out.println("I'm Chicken");
    }
}
