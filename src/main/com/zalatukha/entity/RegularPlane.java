package main.com.zalatukha.entity;

public class RegularPlane extends Plane {
    private String name = "Boeing 777";
    private int maxSpeed = 965;
    private int maxHeight = 13140;
    private VehicleColor color = VehicleColor.WHITE;

    @Override
    public String toString() {
        return "RegularPlane{" +
                "name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", maxHeight=" + maxHeight +
                ", color=" + color +
                '}';
    }
}
