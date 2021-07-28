package com.company;

public class Vehicle {

    private String name;
    private int weight;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, int weight) {
        this.name = name;
        this.weight = weight;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int currentDirection) {
        this.currentDirection += currentDirection;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees");
    }

    public void move(int velocity, int direction) {
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("Vehicle.move(): moving at " + currentVelocity +  " in direction " + currentDirection);
    }


    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop() {
        this.currentVelocity = 0;
    }


}
