package oop.lab.lab11.bridge.demo;

public class WindowsOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.println("Start up Windows.");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Open Microsoft Edge.");
        System.out.println("Load " + url + " in Microsoft Edge.");
    }
}