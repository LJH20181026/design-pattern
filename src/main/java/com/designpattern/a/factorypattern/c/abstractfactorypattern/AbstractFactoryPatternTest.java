package com.designpattern.a.factorypattern.c.abstractfactorypattern;

public class AbstractFactoryPatternTest {
    public static void main(String[] args) {
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        INote javaNote = javaCourseFactory.createNote();
        javaNote.createNote();

        IVideo javaVideo = javaCourseFactory.createVideo();
        javaVideo.createVideo();

        PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();
        INote pythonNote = pythonCourseFactory.createNote();
        IVideo pythonVideo = pythonCourseFactory.createVideo();
        pythonNote.createNote();
        pythonVideo.createVideo();
    }
}
