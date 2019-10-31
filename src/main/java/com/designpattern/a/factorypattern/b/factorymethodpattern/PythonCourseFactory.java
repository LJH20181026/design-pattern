package com.designpattern.a.factorypattern.b.factorymethodpattern;

import com.designpattern.a.factorypattern.course.ICourse;
import com.designpattern.a.factorypattern.course.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {

    @Override
    public ICourse create() {
        return new PythonCourse();
    }

}
