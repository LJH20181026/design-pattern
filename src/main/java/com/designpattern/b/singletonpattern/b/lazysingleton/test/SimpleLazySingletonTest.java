package com.designpattern.b.singletonpattern.b.lazysingleton.test;

import com.designpattern.b.singletonpattern.b.lazysingleton.ExectorThread;

public class SimpleLazySingletonTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ExectorThread());
        Thread thread2 = new Thread(new ExectorThread());
        thread1.start();
        thread2.start();
        System.out.println("End ...");
    }
}
