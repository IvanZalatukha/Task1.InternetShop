package com.zalatukha;

import com.zalatukha.builder2.CarBuilder;
import com.zalatukha.builder2.CarCreator;
import com.zalatukha.builder2.SportCarBuilder;
import com.zalatukha.entity.Car;
import com.zalatukha.entity.Vehicle;
import com.zalatukha.repository.Storage;
import com.zalatukha.shop.Client;
import com.zalatukha.shop.InternetShop;

import java.util.Map;

public class Demo {

    public static void main(String[] args) {

        InternetShop internetShop = new InternetShop();

        Client client = new Client("Ivan", 1, internetShop);
        client.makeAnOrder();


        Storage storage = Storage.getInstance();

        for (Map.Entry<String, Vehicle> pair: storage.getStorage().entrySet()) {
            System.out.println(pair);
        }

        CarCreator carCreator = new CarCreator();
        CarBuilder sportCarBuilder = new SportCarBuilder();

        carCreator.setCarBuilder(sportCarBuilder);
        carCreator.constructCar();

        Car car = sportCarBuilder.getCar();
        System.out.println(car);

    }
}
