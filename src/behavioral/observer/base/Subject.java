package behavioral.observer.base;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observers = new ArrayList<Observer>();
    public Subject(){
    }
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers(Subject subject, Object args) {
        for (Observer observer : observers) {
            observer.notify(subject, args);
        }
    }

}
