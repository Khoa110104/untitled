package oop.lab.lab10.adapterpattern.example;

public class SocketObjectAdapter implements SocketAdapter {
    private Socket socket = new Socket();

    @Override
    public Volt get240Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get24Volt() {
        Volt volt = socket.getVolt();
        return convertVolt(volt, 10);
    }

    @Override
    public Volt get6Volt() {
        Volt volt = socket.getVolt();
        return convertVolt(volt, 40);
    }

    private Volt convertVolt(Volt volt, int i) {
        return new Volt(volt.getVolts() / i);
    }
}
