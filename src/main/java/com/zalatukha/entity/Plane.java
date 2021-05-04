package com.zalatukha.entity;

public class Plane implements Vehicle {
    private String name;
    PlaneType type;
    int seats;
    private int maxSpeed;
    private VehicleColor color;
    private int maxHeight;

    public Plane() {
    }


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

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", seats=" + seats +
                ", maxSpeed=" + maxSpeed +
                ", color=" + color +
                ", maxHeight=" + maxHeight +
                '}';
    }

    public static class Builder {
        private String name;
        private PlaneType type;
        private int seats;
        private int maxSpeed;
        private VehicleColor color;
        private int maxHeight;

        public Builder buildName(String name) {
            this.name = name;
            return this;
        }

        public Builder buildType(PlaneType type) {
            this.type = type;
            return this;
        }

        public Builder buildSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public Builder buildMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder buildColor(VehicleColor color) {
            this.color = color;
            return this;
        }

        public Builder buildMaxHeight(int maxHeight) {
            this.maxHeight = maxHeight;
            return this;
        }

        public Plane build() {
            Plane plane = new Plane();
            plane.name = this.name;
            plane.type = this.type;
            plane.seats = this.seats;
            plane.maxSpeed = this.maxSpeed;
            plane.color = this.color;
            plane.maxHeight = this.maxHeight;

            return plane;
        }

    }

}
