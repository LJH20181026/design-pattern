package com.designpattern.b.singletonpattern.b.lazysingleton;

/**
 *
 */
public class DoubleCheckLazySingleton {

    private DoubleCheckLazySingleton() {}

    private volatile static DoubleCheckLazySingleton instance = null;

    public static DoubleCheckLazySingleton getInstance() {
        if (null == instance) {
            synchronized (DoubleCheckLazySingleton.class) {
                if (null == instance) {
                    instance = new DoubleCheckLazySingleton();
                    //1.分配内存给这个对象
                    //2.初始化这个对象
                    //3.让instance指向刚才分配给对象的内存地址
                }
            }
        }

        return instance;
    }


}
