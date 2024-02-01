package creational.builder;

import creational.builder.carparts.Engine;
import creational.builder.carparts.SeatBelt;
import creational.builder.carparts.WindScreen;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(4,
                new SeatBelt("Tung dz Seat Belt"),
                "red",
                new WindScreen("Tung dz wind screen"),
                new Engine("Tung dz Foot"));

        Car carByBuilder = new CarBuilder()
                .AddWheels(4)
                .AddSeatBelts(new SeatBelt("Tung dz Seat Belt"))
                .AddWindscreen(new WindScreen("Tung dz wind screen"))
                .AddEngine(new Engine("Tung dz Foot"))
                .Paint("red")
                .Build();
        System.out.println(car.toString());
        System.out.println("------------------------------------");
        System.out.println(carByBuilder.toString());
    }
}
