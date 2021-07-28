package com.company;

public class Car extends Vehicle{

    private int wheels;
    private int doors;
    private int gars;
    private boolean isManual;

    private int currentGear;

    public Car(String name, int weight, int wheels, int doors, int gars, boolean isManual) {
        super(name, weight);
        this.wheels = wheels;
        this.doors = doors;
        this.gars = gars;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " +this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
        move(speed,direction);
    }

}
