package com.engineeringdigest.corejava.Interfaces;

public interface Animal {

    int MAX_AGE = 150;

    public abstract void eat();

    void sleep();

    //    Static methods in interface

    public static void info() {
        System.out.println("This is an Animal Interface");
    }

    public default void run() {
        System.out.println("Animal is running!");
    }

}
