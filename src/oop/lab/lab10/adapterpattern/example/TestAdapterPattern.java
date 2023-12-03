package oop.lab.lab10.adapterpattern.example;

public class TestAdapterPattern {

    public static void main(String[] args) {
        System.out.println("----------------------TestClassAdapter--------------------------");
        testClassAdapter();
        System.out.println("----------------------TestObjectAdapter-------------------------");
        testObjectAdapter();
    }

    private static void testObjectAdapter() {
        SocketAdapter sockAdapter = new SocketObjectAdapter();
        Volt volt6 = getVolt(sockAdapter, 6);
        Volt volt24 = getVolt(sockAdapter, 24);
        Volt volt240 = getVolt(sockAdapter, 240);
        System.out.println("Volt6 volts using Object Adapter is: " + volt6.getVolts());
        System.out.println("Volt12 volts using Object Adapter is: " + volt24.getVolts());
        System.out.println("Volt120 volts using Object Adapter is: " + volt240.getVolts());
    }

    private static void testClassAdapter() {
        SocketAdapter sockAdapter = new SocketClassAdapter();
        Volt volt6 = getVolt(sockAdapter, 6);
        Volt volt24 = getVolt(sockAdapter, 24);
        Volt volt240 = getVolt(sockAdapter, 240);
        System.out.println("Volt6 volts using Class Adapter is: " + volt6.getVolts());
        System.out.println("Volt24 volts using Class Adapter is: " + volt24.getVolts());
        System.out.println("Volt240 volts using Class Adapter is: " + volt240.getVolts());
    }

    private static Volt getVolt(SocketAdapter sockAdapter, int i) {
        if (i == 6) {
            return sockAdapter.get6Volt();
        } else if (i == 24) {
            return sockAdapter.get24Volt();
        } else if (i == 240) {
            return sockAdapter.get240Volt();
        }
        return sockAdapter.get240Volt();
    }
}