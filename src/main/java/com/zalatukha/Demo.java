package com.zalatukha;

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

    }
}
