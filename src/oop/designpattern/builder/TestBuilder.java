package oop.designpattern.builder;

public class TestBuilder {
    public static void main(String[] args) {
        Car car = new Car(12,
                new SeatBelt("DAY AN TOAN"),
                "red",
                new Windscreen("KINH CUA SO") ,
                new Engine("DONG CO"));
        Car carBuilder = new CarBuilder()
                .addWheels(4)
                .addSeatBelts(new SeatBelt("day an toan"))
                .addWindscreen(new Windscreen("kinh cua so"))
                .addEngine(new Engine("dong co"))
                .paint("blue")
                .Build();
        System.out.println("---------NO BUILDER---------");
        System.out.println(car);
        System.out.println("---------BUILDER---------");
        System.out.println(carBuilder);
    }
}
