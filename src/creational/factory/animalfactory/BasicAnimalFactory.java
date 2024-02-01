package creational.factory.animalfactory;

import creational.factory.animal.Animal;
import creational.factory.animal.Cat;
import creational.factory.animal.Dog;
import creational.factory.animal.Duck;

public class BasicAnimalFactory implements AnimalFactory{
    private static int index = 0;
    @Override
    public Animal createAnimal() {
        if(index == 0) {
            index++;
            return new Dog();
        }
        if(index == 1){
            index++;
            return new Cat();
        }

        if(index == 2){
            index = 0;
            return  new Duck();
        }

        return null;
    }
}
