package com.designpattern.b.singletonpattern.c.relectbrokensingleton.test;



import com.designpattern.b.singletonpattern.c.relectbrokensingleton.StaticInnerClassLazySingleton2;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射破坏单例
 */
public class StaticInnerClassLazySingletonTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<StaticInnerClassLazySingleton2> clazz = StaticInnerClassLazySingleton2.class;
        Constructor<StaticInnerClassLazySingleton2> constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);

        StaticInnerClassLazySingleton2 staticInnerClassLazySingleton1 = constructor.newInstance();
        StaticInnerClassLazySingleton2 staticInnerClassLazySingleton2 = constructor.newInstance();

        System.out.println(staticInnerClassLazySingleton1 == staticInnerClassLazySingleton2);

    }
}
