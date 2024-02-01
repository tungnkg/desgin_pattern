package creational.builder;

import creational.builder.carparts.Engine;
import creational.builder.carparts.SeatBelt;
import creational.builder.carparts.WindScreen;

public interface ICarBuilder {
    CarBuilder AddWheels(int numberOfWheels);
    CarBuilder AddSeatBelts(SeatBelt seatBelt);
    CarBuilder Paint(String color);
    CarBuilder AddWindscreen(WindScreen windscreen);
    CarBuilder AddEngine(Engine engine);
    Car Build();
}
