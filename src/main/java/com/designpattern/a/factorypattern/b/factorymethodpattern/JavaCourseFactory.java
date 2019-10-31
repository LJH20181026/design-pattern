package com.designpattern.a.factorypattern.b.factorymethodpattern;

import com.designpattern.a.factorypattern.course.ICourse;
import com.designpattern.a.factorypattern.course.JavaCourse;

public class JavaCourseFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
