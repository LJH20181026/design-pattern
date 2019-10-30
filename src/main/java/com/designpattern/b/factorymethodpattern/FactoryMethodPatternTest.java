package com.designpattern.b.factorymethodpattern;

import com.designpattern.course.ICourse;

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
