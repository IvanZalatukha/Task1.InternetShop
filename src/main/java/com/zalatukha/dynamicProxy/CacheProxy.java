package com.zalatukha.dynamicProxy;


import com.zalatukha.dynamicProxy.service.Service;

import java.lang.reflect.Proxy;

public class CacheProxy {

    public Service cache(Service service) {

        ClassLoader classLoader = service.getClass().getClassLoader();
        Class[] interfaces = service.getClass().getInterfaces();
        return (Service) Proxy.newProxyInstance(classLoader, interfaces, new ServiceInvocationHandler(service));

    }
}