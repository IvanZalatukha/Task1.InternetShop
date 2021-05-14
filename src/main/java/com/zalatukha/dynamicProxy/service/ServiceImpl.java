package com.zalatukha.dynamicProxy.service;

import com.zalatukha.dynamicProxy.Cache;
import com.zalatukha.dynamicProxy.CacheType;
import com.zalatukha.dynamicProxy.User;

public class ServiceImpl implements Service {

    @Cache(type = CacheType.JVM_MEMORY)
    public User doHardWork(String name) {
        return new User(name);
    }

    @Cache(type = CacheType.FILE)
    public User doHardWorkElse(String name) {
        return new User(name);
    }
    public User doHardWorkElse2(String name) {
        return new User(name);
    }
}