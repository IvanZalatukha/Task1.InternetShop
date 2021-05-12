package com.zalatukha.dynamicProxy;

import com.zalatukha.dynamicProxy.exceptions.ServiceNotFoundException;

public class Main {
    public static void main(String[] args) throws ServiceNotFoundException {

        CacheProxy cacheProxy = new CacheProxy();
        Service service = cacheProxy.cache(new ServiceImpl());
        User user = service.doHardWorkElse("kolya");
        User user1 = service.doHardWork("sasha");
        User user2 = service.doHardWorkElse("petya");
        User user3 = service.doHardWork("vasya");





    }
}