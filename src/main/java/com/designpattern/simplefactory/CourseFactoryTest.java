package com.designpattern.simplefactory;

import com.designpattern.simplefactory.course.ICourse;
import com.designpattern.simplefactory.course.JavaCourse;
import com.designpattern.simplefactory.course.PythonCourse;
import org.slf4j.LoggerFactory;

import java.util.Calendar;

public class CourseFactoryTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
//        JavaCourse javaCourse = new JavaCourse();
//        javaCourse.record();

        CourseFactory courseFactory = new CourseFactory();
        courseFactory.create("com.designpattern.simplefactory.course.JavaCourse").record();

        ICourse pythonCourse = CourseFactory.createByClazz(PythonCourse.class);
        pythonCourse.record();


//        LoggerFactory.getLogger()
//        Calendar.getInstance()
    }
}
