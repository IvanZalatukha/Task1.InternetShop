package com.zalatukha.dynamicProxy;


import com.zalatukha.dynamicProxy.service.Service;
import com.zalatukha.dynamicProxy.service.ServiceImpl;

public class Main {
    public static void main(String[] args) {

        CacheProxy cacheProxy = new CacheProxy();
        Service service = cacheProxy.cache(new ServiceImpl());

        User user = service.doHardWorkElse("Tom");
        User user1 = service.doHardWork("Karl");
        User user11 = service.doHardWork("Denny");
        User user2 = service.doHardWorkElse("Peter");
        User user22 = service.doHardWorkElse("Peter");
        User user222 = service.doHardWorkElse("Andrew");
        User user3 = service.doHardWork("Addy");
        User user4 = service.doHardWork("Addy");

    }
}