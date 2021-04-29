package main.com.zalatukha.builder;

import main.com.zalatukha.entity.Enum;
import main.com.zalatukha.entity.VehicleColor;

public interface Builder {
    void setName(String name);
    void setType(Enum type);
    void setSeats(int seats);
    void setMaxSpeed(int maxSpeed);
    void setColor(VehicleColor color);
}
