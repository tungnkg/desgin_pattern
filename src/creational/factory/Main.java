package creational.factory;

import creational.factory.animal.Animal;
import creational.factory.animalfactory.AnimalFactory;
import creational.factory.animalfactory.BasicAnimalFactory;
import creational.factory.animalfactory.RandomAnimalFactory;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        AnimalFactory factory;
        Random random = new Random();
        int ran = random.nextInt(0 ,2);
        if(ran == 0){
            factory = new BasicAnimalFactory();
        }else{
            factory = new RandomAnimalFactory();
        }

        factory.createAnimal().getName();
        factory.createAnimal().getName();
        factory.createAnimal().getName();
        factory.createAnimal().getName();
        factory.createAnimal().getName();
    }
}
