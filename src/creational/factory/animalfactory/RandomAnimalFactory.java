package creational.factory.animalfactory;

import creational.factory.animal.Animal;
import creational.factory.animal.Cat;
import creational.factory.animal.Dog;
import creational.factory.animal.Duck;

import java.util.Random;

public class RandomAnimalFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        Random random = new Random();
        int i = random.nextInt(1, 4);
        if(i == 1) return new Dog();
        if(i == 2)return new Cat();
        if (i == 3)return new Duck();
        return null;
    }
}
