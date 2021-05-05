package com.zalatukha.entity;

public class Car implements Vehicle {
    private String name;
    private CarType type;
    private int seats;
    private int maxSpeed;
    private VehicleColor color;

    public Car() {
    }

    @Override
    public void move() {
        System.out.println("The car is moving forward");
    }

    @Override
    public void brake() {
        System.out.println("The car is braking");
    }

    @Override
    public void takePassengers() {
        System.out.println("Passengers get into the car");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", seats=" + seats +
                ", maxSpeed=" + maxSpeed +
                ", color=" + color +
                '}';
    }

    public static class Builder {
        private String name;
        private CarType type;
        private int seats;
        private int maxSpeed;
        private VehicleColor color;

        public Builder buildName(String name) {
            this.name = name;
            return this;
        }

        public Builder buildType(CarType type) {
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

        public Car build() {
            Car car = new Car();
            car.name = this.name;
            car.type = this.type;
            car.seats = this.seats;
            car.maxSpeed = this.maxSpeed;
            car.color = this.color;

            return car;
        }
    }
}
