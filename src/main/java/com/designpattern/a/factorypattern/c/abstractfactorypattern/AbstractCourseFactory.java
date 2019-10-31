package com.designpattern.a.factorypattern.c.abstractfactorypattern;

public interface AbstractCourseFactory {

    INote createNote();

    IVideo createVideo();

    ISource createSource();
}
