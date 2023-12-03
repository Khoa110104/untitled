package oop.lab.lab11.bridge.demo;

public class MacOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.println("Start up Mac");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Open Safari");
        System.out.println("Load " + url + " in Safari");
    }
}