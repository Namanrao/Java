package com.engineeringdigest.corejava.Interfaces.Smartphone;

public class Smartphone extends CheckPhone implements Camera, MusicPlayer, Phone {

    @Override
    public void clickPhoto() {
        System.out.println("SmartPhone is clicking Photos");
    }

    @Override
    public void playMusic() {
        System.out.println("Smartphone is playing music");
    }

    @Override
    public void call(String name) {
        System.out.println("Smartphone is calling" + name);
    }
}
