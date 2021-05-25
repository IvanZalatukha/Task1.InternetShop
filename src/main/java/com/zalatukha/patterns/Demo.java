package com.zalatukha.patterns;

import com.zalatukha.patterns.dao.ImplCarCRUD;
import com.zalatukha.patterns.entity.*;
import com.zalatukha.patterns.hibernate.UserService;
import com.zalatukha.patterns.shop.Client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Demo {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

//        ImplCarCRUD implCarCRUD = new ImplCarCRUD();
//        implCarCRUD.create(new Car.Builder().buildName("another sport car").buildMaxSpeed(222).build());
//        List<Car> carsList = new ArrayList<>();
//        carsList = implCarCRUD.findAll();
//        for(Car a: carsList) {
//            System.out.println(a);
//        }

//        UserService userService = new UserService();
//        Client client = new Client();
//        Car carForTestHibernate = new Car.Builder().buildName("car for hibernate").buildMaxSpeed(777).build();
//        client.setName("Galya");
//        userService.saveUser(client);


        Class.forName("org.h2.Driver");
        Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");


        ImplCarCRUD implCarCRUD = new ImplCarCRUD();
        ImplCarCRUD.setConnection(con);

        implCarCRUD.create(new Car.Builder().buildName("111").buildMaxSpeed(111).build());








    }
}
