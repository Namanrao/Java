package com.PracticeProjects.CarManagementSystem.Showroom;

import com.PracticeProjects.CarManagementSystem.Transport.Vehicle;

public class Bike extends Vehicle {
    public void increaseSpeed(){
        speed+=20;
        System.out.println("Speed is now: "+ speed+ "km/h");
    }

    public void showType(){
        System.out.println("This is a : "+ type);
    }

}
