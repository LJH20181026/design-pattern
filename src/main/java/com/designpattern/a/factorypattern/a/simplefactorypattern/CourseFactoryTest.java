package com.designpattern.a.factorypattern.a.simplefactorypattern;

import com.designpattern.a.factorypattern.course.ICourse;
import com.designpattern.a.factorypattern.course.PythonCourse;

public class CourseFactoryTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
//        JavaCourse javaCourse = new JavaCourse();
//        javaCourse.record();

        CourseFactory courseFactory = new CourseFactory();
//        courseFactory.create("com.designpattern.simplefactory.course.JavaCourse").record();

        ICourse pythonCourse = CourseFactory.createByClazz(PythonCourse.class);
        pythonCourse.record();


//        LoggerFactory.getLogger()
//        Calendar.getInstance()
    }
}
