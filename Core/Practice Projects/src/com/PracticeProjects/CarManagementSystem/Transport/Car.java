package com.PracticeProjects.CarManagementSystem.Transport;

public class Car extends Vehicle{
    public  void accelerate(){
        speed+=20;
        System.out.println("Car accelerated speed is now: "+speed + "km/h");
        System.out.println("Brand Available here: "+brand);

    }
}
