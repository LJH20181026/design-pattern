package com.designpattern.a.factorypattern.c.abstractfactorypattern;

public class PythonCourseFactory implements AbstractCourseFactory {
    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public ISource createSource() {
        return new PythonSource();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }
}
