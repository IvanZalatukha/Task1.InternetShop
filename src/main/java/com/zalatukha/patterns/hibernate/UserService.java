package com.zalatukha.patterns.hibernate;

import com.zalatukha.patterns.entity.Car;
import com.zalatukha.patterns.shop.Client;

import java.util.List;

public class UserService {

    private UserDao usersDao = new UserDao();

    public UserService() {
    }

    public Client findUser(int id) {
        return usersDao.findById(id);
    }

    public void saveUser(Client client) {
        usersDao.save(client);
    }

    public void deleteUser(Client client) {
        usersDao.delete(client);
    }

    public void updateUser(Client client) {
        usersDao.update(client);
    }

    public List<Car> findAllUsers() {
        return usersDao.findAll();
    }

    public Car findAutoById(int id) {
        return usersDao.findAutoById(id);
    }


}
