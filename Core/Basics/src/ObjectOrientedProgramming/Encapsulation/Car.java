package ObjectOrientedProgramming.Encapsulation;

public class Car {
    private String color;
    private String brand;
    private String model;

    private int year;
    private int speed;


    //    We will create a method
    public void accelerate(int increament) {
        speed += increament;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }


    public void brake(int decreament) {
        speed -= decreament;
        if (speed < 0) {
            speed = 0;
        }
    }
}
