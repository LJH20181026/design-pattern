package com.designpattern.a.factorypattern.c.abstractfactorypattern;

public class PythonSource implements ISource {
    @Override
    public void createSource() {
        System.out.println("provide python source ...");
    }
}
