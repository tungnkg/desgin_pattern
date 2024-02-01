package creational.singleton;

import java.util.Random;

public class Singleton {

    private int index;
    private static Singleton singleton;
    private Singleton(int index){
        this.index = index;
    }

    public synchronized static Singleton getInstance(){
        Random random = new Random();
        if(singleton == null){
            singleton = new Singleton(random.nextInt(1, 6));
        }
        return singleton;
    }

    public void test(){
        System.out.println("hello: " + index);
    }
}
