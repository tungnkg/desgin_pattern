package creational.factory.animal;

import creational.abstractFactory.animal.TwoLegAnimal;

public class Duck implements Animal {
    @Override
    public void getName() {
        System.out.println("I'm Duck");
    }
}
