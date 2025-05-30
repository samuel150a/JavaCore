package com.samuel.work;

public class BluetoothSpeaker65 extends Speaker65 {
    public BluetoothSpeaker65() {
        System.out.println("Running in the BluetoothSpeaker65 constructor");
    }

    @Override
    public void playSound() {
        System.out.println("Running public method playSound by child class");
    }

    public void connectBluetooth() {
        System.out.println("Running in public method connectBluetooth");
    }
}
