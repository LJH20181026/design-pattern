package com.designpattern.a.factorypattern.c.abstractfactorypattern;

public class JavaCourseFactory implements AbstractCourseFactory {
    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public ISource createSource() {
        return new JavaSource();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
