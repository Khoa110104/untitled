package oop.lab.lab10.adapterpattern.example;

public class Socket {
    public Volt getVolt() {
        return new Volt(240);
    }
}
