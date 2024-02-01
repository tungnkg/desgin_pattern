package creational.abstractFactory.animalfactory;

import creational.abstractFactory.animal.Animal;
import creational.abstractFactory.animal.Cat;
import creational.abstractFactory.animal.Dog;

public class FourLegAnimalFactory implements AnimalFactory {
    private static int index = 0;
    @Override
    public Animal createAnimal() {
        if(index == 0) {
            index++;
            return new Dog();
        }
        if(index == 1){
            index = 0;
            return new Cat();
        }
        return null;
    }
}
