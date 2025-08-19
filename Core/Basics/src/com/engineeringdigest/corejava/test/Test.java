package com.engineeringdigest.corejava.test;

class A {
    static {
        System.out.println("A static");
    }

    {
        System.out.println("A instance");
    }

    A() {
        System.out.println("A constructor");
    }
}

class B extends A {
    static {
        System.out.println("B static");
    }

    {
        System.out.println("B instance");
    }

    B() {
        System.out.println("B constructor");
    }
}

public class Test {
    public static void main(String[] args) {
        B b = new B();
    }
}

