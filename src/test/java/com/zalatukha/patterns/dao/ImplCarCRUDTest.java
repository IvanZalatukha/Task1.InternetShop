package com.zalatukha.patterns.dao;

import com.zalatukha.patterns.entity.Car;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class ImplCarCRUDTest {
    ImplCarCRUD implCarCRUD = new ImplCarCRUD();
    private static Connection con;

    @BeforeClass
    public static void initDB() {
        try {
            Class.forName("org.h2.Driver");
             con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
            ImplCarCRUD.setConnection(con);

            PreparedStatement initDB = con.prepareStatement("drop table cars if exists ;" +
                    "create table CARS\n" +
                    "(\n" +
                    "    ID        INT auto_increment,\n" +
                    "    NAME      VARCHAR(40) not null,\n" +
                    "    MAX_SPEED INT,\n" +
                    "    constraint CARS_PK\n" +
                    "        primary key (ID)\n" +
                    ");");
            initDB.execute();

            Car ferrari = new Car.Builder().buildName("Ferrari").buildMaxSpeed(222).build();
            PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO cars ( name, max_speed) VALUES (?, ?)");
            preparedStatement.setString(1, ferrari.getName());
            preparedStatement.setInt(2, ferrari.getMaxSpeed());
            preparedStatement.executeUpdate();



        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findById() {
        assertNotNull(implCarCRUD.findById(1));
    }

    @Test
    public void findAll() {
        List<Car> carsList = implCarCRUD.findAll();
        assertEquals(1, carsList.size());
    }

    @Test
    public void create() {
        Car porshe = new Car.Builder().buildName("Porshe").buildMaxSpeed(333).build();
        assertTrue(implCarCRUD.create(porshe));
    }

    @Test
    public void update() {
        Car lamba = new Car.Builder().buildName("Lamborgini").buildMaxSpeed(444).build();
        assertTrue(implCarCRUD.update(1, lamba));
    }

    @Test
    public void delete() {
        assertTrue(implCarCRUD.delete(2));
    }

    @AfterClass
    public static void close() {
        try {
            PreparedStatement drop = con.prepareStatement("drop table cars if exists");
            drop.execute();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}