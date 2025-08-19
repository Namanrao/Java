package com.engineeringdigest.corejava.test;

public class Animal {

    private String name;
    private int age;


    //    constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("Makes sound");
    }

    public void flying() {
        System.out.println(this.name + " is flying !!");
    }
}
