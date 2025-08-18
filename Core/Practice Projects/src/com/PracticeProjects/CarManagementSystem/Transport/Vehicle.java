package com.PracticeProjects.CarManagementSystem.Transport;

public class Vehicle {
    private String engineNumber= "ENG123";
    String brand = "Generic";
    protected int speed = 60;
    public String type = "Vehicle";


    private void showEngineNumber(){
        System.out.println("Engine No: "+ engineNumber);
    }

    public void printDetails(){
        System.out.println("Brand: "+brand);
        System.out.println("Type: "+type);
        System.out.println("Speed: "+speed + "km/h");
        showEngineNumber();
    }

}
