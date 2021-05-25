package com.zalatukha.patterns.dao;

import com.zalatukha.patterns.entity.Car;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ImplCarCRUD implements CRUDRepository {

    private static final String FIND_BY_ID = "SELECT * FROM cars WHERE id=?";
    private static final String FIND_ALL = "SELECT * FROM cars ORDER BY id";
    private static final String CREATE = "INSERT INTO cars ( name, max_speed) VALUES (?, ?)";
    private static final String DELETE = "DELETE FROM cars WHERE id=?";
    private static final String UPDATE = "UPDATE cars SET name=?, max_speed=? WHERE id=?";
    private static Connection connection;

    public static void setConnection(Connection connection) {
        ImplCarCRUD.connection = connection;
    }

    static {
        try {
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/db", "test", "test");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Car findById(int id) {

        Car car = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultStatement = preparedStatement.executeQuery();
            if (resultStatement.next()) {
                car = new Car.Builder()
                        .buildName(resultStatement.getString("name"))
                        .buildMaxSpeed(resultStatement.getInt("max_speed"))
                        .build();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return car;
    }


    @Override
    public List findAll() {
        List<Car> list = new ArrayList<>();
        Car car;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL);
            ResultSet resultStatement = preparedStatement.executeQuery();
            while (resultStatement.next()) {
                car = new Car.Builder()
                        .buildName(resultStatement.getString("name"))
                        .buildMaxSpeed(resultStatement.getInt("max_speed"))
                        .build();
                list.add(car);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public boolean create(Object obj) {
        Car car = (Car) obj;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(CREATE);

            preparedStatement.setString(1, car.getName());
            preparedStatement.setInt(2, car.getMaxSpeed());

            int i = preparedStatement.executeUpdate();
            if (i == 1) {
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public boolean update(int id, Object obj) {
        Car car = (Car) obj;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setString(1, car.getName());
            preparedStatement.setInt(2, car.getMaxSpeed());
            preparedStatement.setInt(3, id);
            int i = preparedStatement.executeUpdate();
            if (i == 1) {
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE);
            preparedStatement.setInt(1, id);
            int i = preparedStatement.executeUpdate();
            if (i == 1) {
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
