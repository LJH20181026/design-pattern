package com.designpattern.simplefactory.course;

public class PythonCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("python course...");
    }
}
