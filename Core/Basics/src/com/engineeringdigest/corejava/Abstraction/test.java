package com.engineeringdigest.corejava.Abstraction;

public class test {
    public static void main(String[] args) {

        // Animal animal = new Animal(); // object of  abstract class cannot be made.
        Animal dog = new Dog(); //take the reference of abstract class.
        dog.sayHello();

    }
}