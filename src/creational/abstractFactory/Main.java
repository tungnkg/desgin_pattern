package creational.abstractFactory;

import creational.abstractFactory.animalfactory.AnimalFactory;
import creational.abstractFactory.animalfactory.FourLegAnimalFactory;
import creational.abstractFactory.animalfactory.TwoLegAnimalFactory;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        AnimalFactory factory;
        Random random = new Random();
        int ran = random.nextInt(0 ,2);
        if(ran == 0){
            factory = new FourLegAnimalFactory();
        }else{
            factory = new TwoLegAnimalFactory();
        }

        factory.createAnimal().getName();
        factory.createAnimal().getName();
        factory.createAnimal().getName();
        factory.createAnimal().getName();
        factory.createAnimal().getName();
    }
}
