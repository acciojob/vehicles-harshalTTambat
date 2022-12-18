package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {

        //Hint: Car extends Vehicle
        // initialize the variables using parameters and set currentGear as 1.
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;
        this.gears = gears;
        setCurrentGear(1);
    }

    public void changeGear(int newGear){
        setCurrentGear(newGear);
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){

        move(newSpeed,newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
