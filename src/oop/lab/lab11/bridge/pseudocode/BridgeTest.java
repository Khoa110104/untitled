package oop.lab.lab11.bridge.pseudocode;

public class BridgeTest {
    public static void main(String[] args) {
        System.out.println("**************************TV**************************\n");
        Tv tv = new Tv();
        RemoteControl remoteControl = new RemoteControl(tv);
        remoteControl.togglePower();
        tv.printStatus();
        remoteControl.volumeDown();
        tv.printStatus();
        remoteControl.volumeUp();
        tv.printStatus();
        remoteControl.channelDown();
        tv.printStatus();
        remoteControl.channelUp();
        tv.printStatus();

        System.out.println("**************************RADIO**************************\n");

        Radio radio = new Radio();
        AdvancedRemoteControl remoteControl1 = new AdvancedRemoteControl(radio);
        remoteControl1.togglePower();
        radio.printStatus();
        remoteControl1.volumeDown();
        radio.printStatus();
        remoteControl1.volumeUp();
        radio.printStatus();
        remoteControl1.channelDown();
        radio.printStatus();
        remoteControl1.channelUp();
        radio.printStatus();
    }
}
