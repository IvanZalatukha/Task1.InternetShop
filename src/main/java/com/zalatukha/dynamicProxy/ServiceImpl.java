package com.zalatukha.dynamicProxy;

public class ServiceImpl implements Service{

    @Cache(type = CacheType.jvmMemory)
    public User doHardWork(String name) {
        return new User(name);
    }

    @Cache(type = CacheType.file)
    public User doHardWorkElse(String name){
        return new User(name);
    }
}