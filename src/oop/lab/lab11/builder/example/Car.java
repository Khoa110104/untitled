package oop.lab.lab11.builder.example;

public class Car {
    public int numberOfWheels;
    public SeatBelt seatBelt;
    public String color;
    public Windscreen windscreen;
    public Engine engine;

    public Car(int numberOfWheels,
               SeatBelt seatBelt,
               String color,
               Windscreen windscreen,
               Engine engine) {
        this.numberOfWheels = numberOfWheels;
        this.seatBelt = seatBelt;
        this.color = color;
        this.windscreen = windscreen;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "NumberOfWheels=" + numberOfWheels +
                ", seatBelt=" + seatBelt +
                ", color='" + color + '\'' +
                ", windscreen=" + windscreen +
                ", engine=" + engine +
                '}';
    }
}
