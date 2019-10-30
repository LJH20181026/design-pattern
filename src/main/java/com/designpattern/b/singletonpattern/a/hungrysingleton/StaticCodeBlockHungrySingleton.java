package com.designpattern.b.singletonpattern.a.hungrysingleton;

public class StaticCodeBlockHungrySingleton {

    private static final StaticCodeBlockHungrySingleton instance;

    static {
        instance = new StaticCodeBlockHungrySingleton();
    }

    private StaticCodeBlockHungrySingleton() {

    }

    public static StaticCodeBlockHungrySingleton getInstance() {
        return instance;
    }
}
