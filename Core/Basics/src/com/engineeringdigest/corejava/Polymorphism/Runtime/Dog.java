package com.engineeringdigest.corejava.Polymorphism.Runtime;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    public void run() {
        System.out.println("Dog is running!");
    }

}
