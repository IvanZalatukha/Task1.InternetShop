package main.com.zalatukha.entity;

public class SportCar extends Car {
    private String name = "Lamba";
    private int maxSpeed = 300;
    private VehicleColor color = VehicleColor.RED;

    @Override
    public String toString() {
        return "SportCar{" +
                "name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", color=" + color +
                '}';
    }
}
