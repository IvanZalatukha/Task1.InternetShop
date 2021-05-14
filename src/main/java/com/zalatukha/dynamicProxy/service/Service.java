package com.zalatukha.dynamicProxy.service;

import com.zalatukha.dynamicProxy.User;

public interface Service {
    User doHardWork(String name);
    User doHardWorkElse(String name);
    User doHardWorkElse2(String name);
}