package com.engineeringdigest.corejava.humans;

public class Child extends Parent {

    Parent parent = new Parent();

    public Child() {
//        super() -> apni parent class ka default constructor called karenge.
        System.out.println("Child constructor called!");
    }

    public void childMethod() {

        System.out.println("Child method called!");
        super.parentMehtod();
    }
}
