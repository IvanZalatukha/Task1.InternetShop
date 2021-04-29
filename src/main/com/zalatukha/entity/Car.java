package main.com.zalatukha.entity;

public abstract class Car implements Vehicle {
    private String name;
    private int maxSpeed;
    private VehicleColor color;

    @Override
    public void move() {
        System.out.println("1");
    }

    @Override
    public void brake() {
        System.out.println("2");
    }

    @Override
    public void takePassengers() {
        System.out.println("3");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public VehicleColor getColor() {
        return color;
    }

    public void setColor(VehicleColor color) {
        this.color = color;
    }
}
