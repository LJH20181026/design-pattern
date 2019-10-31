package com.designpattern.a.factorypattern.b.factorymethodpattern;

import com.designpattern.a.factorypattern.course.ICourse;

public class FactoryMethodPatternTest {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        ICourse course = factory.create();
        course.record();

        factory = new PythonCourseFactory();
        course = factory.create();
        course.record();

    }
}
