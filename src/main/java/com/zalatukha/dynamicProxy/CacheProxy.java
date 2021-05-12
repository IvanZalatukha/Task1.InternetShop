package com.zalatukha.dynamicProxy;


import com.zalatukha.dynamicProxy.exceptions.ServiceNotFoundException;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.MethodDelegation;
import net.bytebuddy.matcher.ElementMatchers;

import java.lang.reflect.Proxy;

public class CacheProxy {

    public Service cache(Service service) throws ServiceNotFoundException {



        ServiceImpl serviceImpl = new ServiceImpl();
        ClassLoader classLoader = serviceImpl.getClass().getClassLoader();
        Class[] interfaces = serviceImpl.getClass().getInterfaces();
        Service proxyService = (Service) Proxy.newProxyInstance(classLoader, interfaces, new ServiceInvocationHandler(serviceImpl));


        return proxyService;



//        try {
//                return new ByteBuddy()
//                        .subclass(service.getClass())
//                        .method(ElementMatchers.isAnnotatedWith(Cache.class))
//                        .intercept(MethodDelegation.to(new ServiceInterceptor()))
//                        .make()
//                        .load(this.getClass().getClassLoader())
//                        .getLoaded()
//                        .newInstance();
//            } catch (InstantiationException | IllegalAccessException e) {
//                e.printStackTrace();
//        }

    }
}