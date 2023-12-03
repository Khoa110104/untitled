package oop.designpattern.builder;

public interface Builder {
    CarBuilder addWheels(int numberOfWheels);
    CarBuilder addSeatBelts(SeatBelt seatBelt);
    CarBuilder paint(String color);
    CarBuilder addWindscreen(Windscreen windscreen);
    CarBuilder addEngine(Engine engine);
    Car Build();
}
