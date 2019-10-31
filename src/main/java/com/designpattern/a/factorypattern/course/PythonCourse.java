package com.designpattern.a.factorypattern.course;

public class PythonCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("python course ...");
    }

    @Override
    public void edit() {
        System.out.println("python note ...");
    }
}
