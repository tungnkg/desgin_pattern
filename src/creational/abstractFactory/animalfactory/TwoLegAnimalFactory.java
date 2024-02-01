package creational.abstractFactory.animalfactory;

import creational.abstractFactory.animal.*;

import java.util.Random;

public class TwoLegAnimalFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        Random random = new Random();
        int i = random.nextInt(1, 3);
        if(i == 1) return new Chicken();
        else return new Duck();
    }
}
