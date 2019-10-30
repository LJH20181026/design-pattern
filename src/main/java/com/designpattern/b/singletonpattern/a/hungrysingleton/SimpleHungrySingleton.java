package com.designpattern.b.singletonpattern.a.hungrysingleton;

/**
 * 1.构造函数私有化
 * 2.饿汉式单例：
 *    优点：没有锁，效率高
 *    缺点：类加载的时候就初始化，不管用不用都占着空间
 */
public class SimpleHungrySingleton {

    private static final SimpleHungrySingleton instance = new SimpleHungrySingleton();

    private SimpleHungrySingleton() {

    }

    public static SimpleHungrySingleton getInstance() {
        return instance;
    }
    
}
