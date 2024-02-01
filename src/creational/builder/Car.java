package creational.builder;

import creational.builder.carparts.Engine;
import creational.builder.carparts.SeatBelt;
import creational.builder.carparts.WindScreen;

public class Car {
    private int numberOfWheels;
    private SeatBelt seatBelts;
    private String color ;
    private WindScreen windScreen ;
    private Engine engine ;


    public Car(int numberOfWheels, SeatBelt seatBelts, String color, WindScreen windScreen, Engine engine) {
        this.numberOfWheels = numberOfWheels;
        this.seatBelts = seatBelts;
        this.color = color;
        this.windScreen = windScreen;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfWheels=" + numberOfWheels +
                ", seatBelts=" + seatBelts.getName() +
                ", color='" + color + '\'' +
                ", windScreen=" + windScreen.getName() +
                ", engine=" + engine.getName() +
                '}';
    }
}
