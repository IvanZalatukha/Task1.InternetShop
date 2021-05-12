package com.zalatukha.dynamicProxy;

import com.zalatukha.dynamicProxy.exceptions.UserNotFoundException;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class ServiceInvocationHandler implements InvocationHandler {
    private Service service;
    Map<String, Object> jvmMemory;
    File file;

    public ServiceInvocationHandler(Service service) {
        this.service = service;
        this.jvmMemory = new HashMap<>();

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Cache cache = method.getAnnotation(Cache.class);
        String name = (String) args[0];
        if (cache.type().equals(CacheType.jvmMemory)) {
            User user = (User) jvmMemory.get(name);
            if (user == null) {
                User newUser = new User(name);
                jvmMemory.put(name, newUser);
                return newUser;
            }
        } else {
            file = new File("src/main/java/com/zalatukha/dynamicProxy/cache");
            User user = readUser(name);
            if (user == null) {
                return writeUser(name);
            }
        }

        throw new UserNotFoundException();

//        return method.invoke(service, args);
    }
    private User writeUser(String name) throws IOException {
        List<String> lines = Collections.singletonList(name);
        Files.write(file.toPath(), lines, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        return new User(name);
    }

    private User readUser(String name) throws IOException {
        Optional<User> user = Files.lines(Paths.get(file.toURI()))
                .filter(line -> line.equals(name))
                .limit(1)
                .map(line -> new User(name))
                .findFirst();
        return user.orElse(null);
    }
}
