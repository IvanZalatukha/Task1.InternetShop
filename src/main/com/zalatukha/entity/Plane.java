package main.com.zalatukha.entity;

public abstract class Plane implements Vehicle {
    private String name;
    private int maxSpeed;
    private int maxHeight;
    private VehicleColor color;

    @Override
    public void move() {
        System.out.println("3");
    }

    @Override
    public void brake() {
        System.out.println("2");
    }

    @Override
    public void takePassengers() {
        System.out.println("1");
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

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public VehicleColor getColor() {
        return color;
    }

    public void setColor(VehicleColor color) {
        this.color = color;
    }
}
