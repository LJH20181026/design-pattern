package com.designpattern.course;

public class JavaCourse implements ICourse {
    @Override
    public void edit() {
        System.out.println("java note ...");
    }

    @Override
    public void record() {
        System.out.println("java course ...");
    }
}
