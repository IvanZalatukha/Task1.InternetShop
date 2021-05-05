package com.zalatukha.classLoader;

import java.io.File;

public class ModuleEngine {

    public static void main(String args[]) {
        String modulePath = "target/classes/com/zalatukha/classLoader/modules";
        /**
         * Создаем загрузчик модулей.
         */
        ModuleLoader loader = new ModuleLoader(modulePath, ClassLoader.getSystemClassLoader());

        /**
         * Получаем список доступных модулей.
         */
        File dir = new File(modulePath);
        String[] modules = dir.list();

        /**
         * Загружаем и исполняем каждый модуль.
         */
        for (String module : modules) {
            try {
                String moduleName = module.split(".class")[0];
                Class clazz = loader.loadClass(moduleName);
                Module execute = (Module) clazz.newInstance();

                execute.load();
                execute.run();
                execute.unload();

            } catch (IllegalAccessException | ClassNotFoundException | InstantiationException e) {
                e.printStackTrace();
            }
        }


    }

}