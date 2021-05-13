package com.zalatukha.dynamicProxy;

public class ServiceImpl implements Service {

    @Cache(type = CacheType.JVM_MEMORY)
    public User doHardWork(String name) {
        return new User(name);
    }

    @Cache(type = CacheType.FILE)
    public User doHardWorkElse(String name) {
        return new User(name);
    }
}