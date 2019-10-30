package com.designpattern.b.singletonpattern.b.lazysingleton;

public class ExectorThread implements Runnable {

    @Override
    public void run() {
        SimpleLazySingleton simpleLazySingleton = SimpleLazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "" + simpleLazySingleton);
    }
}
