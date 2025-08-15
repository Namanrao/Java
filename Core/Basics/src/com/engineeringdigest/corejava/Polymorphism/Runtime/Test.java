package com.engineeringdigest.corejava.Polymorphism.Runtime;

public class Test {
    public static void main(String[] args) {


        Animal cat = new Cat(); //This is known as  upcasting.
        Animal dog = new Dog();


//        below given here is an example of run time polymorphism or  also known as dynamic method dispatch.
        cat.makeSound();
        dog.makeSound();


//        In this type of  polymorphism only the methods that are present in the reference class can be called.
//        dog.run() ; -> we are not able to call this method .

        dog.name();
    }
}
