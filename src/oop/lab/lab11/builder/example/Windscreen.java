package oop.lab.lab11.builder.example;

public class Windscreen {
    public String name;

    public Windscreen(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Windscreen{" +
                "name='" + name + '\'' +
                '}';
    }
}
