package com.engineeringdigest.corejava.selflearning.one;

class Bennett {
    //default access modifier
    private String name = "John";
    private int age = 23;

    //    When I want nobody coudl make a obejct of this class/
//      I will use the custo constrductor of  privat eytpe
    private void Bennett() {
    }


    private static Bennett instance() {
        return new Bennett();
    }

}

