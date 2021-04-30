package main.com.zalatukha.repository;

import main.com.zalatukha.entity.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class Storage {

    private static Storage instance;
    private static final Map<String, Vehicle> STORAGE = new HashMap<>();

    private Storage() {
    }

    public static synchronized Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }

    public void put(String key, Vehicle value) {
        STORAGE.put(key, value);
    }

    public Vehicle get(String key) {
       return STORAGE.get(key);
    }

    public Map<String, Vehicle> getStorage() {
        return STORAGE;
    }

    public void remove(String key) {
        STORAGE.remove(key);
    }

}
