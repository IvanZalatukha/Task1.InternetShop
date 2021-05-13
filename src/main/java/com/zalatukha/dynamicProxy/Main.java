package com.zalatukha.dynamicProxy;


public class Main {
    public static void main(String[] args) {



        CacheProxy cacheProxy = new CacheProxy();
        Service service = cacheProxy.cache(new ServiceImpl());

        User user = service.doHardWorkElse("kolya");
        User user1 = service.doHardWork("sasha");
        User user11 = service.doHardWork("sasha");
        User user2 = service.doHardWorkElse("petya");
        User user22 = service.doHardWorkElse("petya");
        User user222 = service.doHardWorkElse("petyaasdadsasdsa");
        User user3 = service.doHardWork("vasya");
        User user4 = service.doHardWork("vasya");





    }
}