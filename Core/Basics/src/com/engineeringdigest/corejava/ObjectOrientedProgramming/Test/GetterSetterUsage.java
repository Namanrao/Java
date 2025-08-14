package com.engineeringdigest.corejava.ObjectOrientedProgramming.Test;

public class GetterSetterUsage {
    public static void main(String[] args) {
        Cat a = new Cat();
        a.setName("bob"); //Please do mind that the name is in lower case.
        Cat newcat = myNameUpperCase(a);
        System.out.println(newcat.getName());
    }

    public static Cat myNameUpperCase(Cat cat) {
        cat.setName(cat.getName().toUpperCase()); //This function will convert lower case letter to upper case letters .
        return cat;
    }
}
