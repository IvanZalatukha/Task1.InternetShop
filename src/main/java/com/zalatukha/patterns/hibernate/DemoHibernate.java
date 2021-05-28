package com.zalatukha.patterns.hibernate;

import java.util.List;

public class DemoHibernate {

    public static void main(String[] args) {

        UserService userService = new UserService();

        List<User> users = userService.findAllUsers();

        for(User a: users) {
            System.out.println(a);
        }
        System.out.println();




    }
}
