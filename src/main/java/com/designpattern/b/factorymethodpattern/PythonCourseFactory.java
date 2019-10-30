package com.designpattern.b.factorymethodpattern;

import com.designpattern.course.ICourse;
import com.designpattern.course.JavaCourse;
import com.designpattern.course.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {

    @Override
    public ICourse create() {
        return new PythonCourse();
    }

}
