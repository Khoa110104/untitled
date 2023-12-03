package oop.lab.lab11.builder.pseudocode;

public class Director {
    public void constructSportCar(Builder builder) {
        builder.reset()
                .setSeats(3)
                .setEngine(new Engine(6, 2))
                .setTripComputer(new TripComputer())
                .setGPS(new GPS());
    }

    public void constructSUV(Builder builder) {
        builder.reset()
                .setSeats(99)
                .setEngine(new Engine(3, 0))
                .setGPS(new GPS());
    }
}
