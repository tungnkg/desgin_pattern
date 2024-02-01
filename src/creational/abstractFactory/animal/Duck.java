package creational.abstractFactory.animal;

public class Duck extends TwoLegAnimal{
    @Override
    public void getName() {
        System.out.println("I'm Duck");
    }
}
