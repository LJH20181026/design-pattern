package com.designpattern.c.prototypepattern.simple;

import lombok.Data;

import java.util.List;

@Data
public class ConcretePrototypeA implements Prototype {

    private int age;
    private String name;
    private List hobbies;

    @Override
    public ConcretePrototypeA clone() {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setAge(this.age);
        concretePrototypeA.setName(this.name);
        concretePrototypeA.setHobbies(this.hobbies);

        return concretePrototypeA;
    }
}
