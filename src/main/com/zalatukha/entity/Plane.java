package main.com.zalatukha.entity;

public class Plane implements Vehicle {
    private String name;
    PlaneType type;
    int seats;
    private int maxSpeed;
    private VehicleColor color;

    @Override
    public void move() {
        System.out.println("The plane is moving forward");
    }

    @Override
    public void brake() {
        System.out.println("The plane is landing");
    }

    @Override
    public void takePassengers() {
        System.out.println("Passengers get into the plane");
    }

}
