package com.zalatukha.builder;

import com.zalatukha.entity.VehicleColor;


public interface Builder {
    void setName(String name);

    void setType(Enum type);

    void setSeats(int seats);

    void setMaxSpeed(int maxSpeed);

    void setColor(VehicleColor color);
}
