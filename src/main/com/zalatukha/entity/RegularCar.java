package main.com.zalatukha.entity;

public class RegularCar extends Car {
    private String name = "RegularCar";
    private int maxSpeed = 100;
    private VehicleColor color = VehicleColor.BLACK;

    @Override
    public String toString() {
        return "SportCar{" +
                "name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", color=" + color +
                '}';
    }
}
