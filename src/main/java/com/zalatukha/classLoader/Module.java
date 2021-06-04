package com.zalatukha.classLoader;

public interface Module {

    int EXIT_SUCCESS = 0;
    int EXIT_FAILURE = 1;

    void load();

    int run();

    void unload();

}