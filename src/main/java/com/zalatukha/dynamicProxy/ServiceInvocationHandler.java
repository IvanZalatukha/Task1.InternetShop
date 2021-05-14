package com.zalatukha.dynamicProxy;

import com.zalatukha.dynamicProxy.service.Service;

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
    private final Service SERVICE;
    private final Map<String, Object> MEMORY;
    private File file;

    public ServiceInvocationHandler(Service service) {
        this.SERVICE = service;
        this.MEMORY = new HashMap<>();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        User user;
        String name = (String) args[0];

        Cache cache = SERVICE.getClass().getMethod(method.getName(),
                method.getParameterTypes()).getAnnotation(Cache.class);

        if (cache == null) {
            return new User(name);
        }

        if (cache.type().equals(CacheType.JVM_MEMORY)) {
            user = (User) MEMORY.get(name);
            if (user == null) {
                user = new User(name);
                MEMORY.put(name, user);
            }
        } else {
            file = new File("src/main/java/com/zalatukha/dynamicProxy/forWritingTestData");
            user = readUser(name);
            if (user == null) {
                return writeUser(name);
            }
        }
        return user;
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
