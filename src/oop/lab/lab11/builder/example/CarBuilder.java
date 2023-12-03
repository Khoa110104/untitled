package oop.lab.lab11.builder.example;

public class CarBuilder implements Builder {
    public int numberOfWheels;
    public SeatBelt seatBelt;
    public String color;
    public Windscreen windscreen;
    public Engine engine;

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public SeatBelt getSeatBelt() {
        return seatBelt;
    }

    public void setSeatBelt(SeatBelt seatBelt) {
        this.seatBelt = seatBelt;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Windscreen getWindscreen() {
        return windscreen;
    }

    public void setWindscreen(Windscreen windscreen) {
        this.windscreen = windscreen;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public CarBuilder addWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        return this;
    }

    @Override
    public CarBuilder addSeatBelts(SeatBelt seatBelt) {
        this.seatBelt = seatBelt;
        return this;
    }

    @Override
    public CarBuilder paint(String color) {
        this.color = color;
        return this;
    }

    @Override

    public CarBuilder addWindscreen(Windscreen windscreen) {
        this.windscreen = windscreen;
        return this;
    }


    public CarBuilder addEngine(Engine engine) {
        this.engine = engine;
        return this;
    }


    public Car Build() {
        return new Car(numberOfWheels, seatBelt, color, windscreen, engine);
    }
}
