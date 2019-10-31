package com.designpattern.b.singletonpattern.b.lazysingleton;

/**
 * 存在安全隐患
 */
public class SimpleLazySingleton {

    private static SimpleLazySingleton instance = null;

    private SimpleLazySingleton() {

    }

    public static SimpleLazySingleton getInstance() {
        if (null == instance) {
            instance = new SimpleLazySingleton();
        }
        return instance;
    }

}
