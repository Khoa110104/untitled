package oop.lab.lab11.builder.example;

public class SeatBelt {
    public String brand;

    public SeatBelt(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "SeatBelt{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
