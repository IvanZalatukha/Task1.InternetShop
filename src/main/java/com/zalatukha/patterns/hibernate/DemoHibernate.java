package com.zalatukha.patterns.hibernate;

public class DemoHibernate {

    public static void main(String[] args) {

        UserService userService = new UserService();

        User mike = new User("Mike", "from Warszaw");


        Passport passport = new Passport("MP", 232323);

        mike.setPassport(passport);

        passport.setOwner(mike);

        userService.saveUser(mike);

    }
}
