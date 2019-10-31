package com.designpattern.b.singletonpattern.b.lazysingleton;

/**
 * 静态内部类单例解决了饿汉式的内存浪费问题和synchronized线程安全问题
 */
public class StaticInnerClassLazySingleton {

    private StaticInnerClassLazySingleton() {

    }

    private static StaticInnerClassLazySingleton instance = null;

    /**
     * final方法不能被重写，重载
     * final类不能被继承
     * @return
     */
    private static final StaticInnerClassLazySingleton getInstance() {
        return InnerClass.INSTANCE;
    }

    /**
     * 使用StaticInnerClassLazySingleton时会先初始化内部类，不使用是不会加载的
     *
     */
    private static class InnerClass {
        private static final StaticInnerClassLazySingleton INSTANCE = new StaticInnerClassLazySingleton();
    }

}
