package com.designpattern.b.singletonpattern.b.lazysingleton;

public class SynchronizedLazySingleton {

    private SynchronizedLazySingleton() {}

    private static SynchronizedLazySingleton instance = null;

    /**
     * synchronized解决了线程安全问题，但是在线程数量很多的时候有可能出现线程阻塞的情况
     * @return
     */
    public synchronized static SynchronizedLazySingleton getInstance() {
        if (null == instance) {
            instance = new SynchronizedLazySingleton();
        }
        return instance;
    }

}
