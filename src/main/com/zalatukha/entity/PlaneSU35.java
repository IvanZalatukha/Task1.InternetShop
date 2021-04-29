package main.com.zalatukha.entity;

public class PlaneSU35 extends Plane {
    private String name = "SU 35";
    private int maxSpeed = 1400;
    private int maxHeight = 15000;
    private VehicleColor color = VehicleColor.BLUE;
    @Override
    public void move() {
        System.out.println("Let's fly");    }

    @Override
    public void brake() {
        System.out.println("Landing");
    }

    @Override
    public void takePassengers() {
        System.out.println("I can take only one pilot");
    }
}
