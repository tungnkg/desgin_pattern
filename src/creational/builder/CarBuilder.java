package creational.builder;

import creational.builder.carparts.Engine;
import creational.builder.carparts.SeatBelt;
import creational.builder.carparts.WindScreen;

public class CarBuilder implements ICarBuilder{

    public int numberOfWheels;
    public SeatBelt seatBelts;
    public String color ;
    public WindScreen windScreen ;
    public Engine engine ;

    @Override
    public CarBuilder AddWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        return this;
    }

    @Override
    public CarBuilder AddSeatBelts(SeatBelt seatBelt) {
        this.seatBelts = seatBelt;
        return this;
    }

    @Override
    public CarBuilder Paint(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilder AddWindscreen(WindScreen windscreen) {
        this.windScreen = windscreen;
        return this;
    }

    @Override
    public CarBuilder AddEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public Car Build() {
        return new Car(numberOfWheels, seatBelts, color, windScreen, engine);
    }
}
