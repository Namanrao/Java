package com.engineeringdigest.corejava.Polymorphism.CompileTime;

public class Test {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

//        Below written is an example of compile time polymorphism or method overloading

        System.out.println(calc.add(3, 4));
        System.out.println(calc.add(2, 3, 5));
        System.out.println(calc.add(3.4, 5.6));

    }
}
