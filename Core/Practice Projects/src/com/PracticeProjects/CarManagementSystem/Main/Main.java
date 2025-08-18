package com.PracticeProjects.CarManagementSystem.Main;

import com.PracticeProjects.CarManagementSystem.Showroom.Bike;
import com.PracticeProjects.CarManagementSystem.Transport.Car;
import com.PracticeProjects.CarManagementSystem.Transport.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.printDetails();
        System.out.println(v.type);

        Car c = new Car();
        c.accelerate();


        Bike  b = new Bike();
        b.increaseSpeed();
        b.showType();
    }
}
