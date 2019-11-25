package com.designpattern.c.prototypepattern.simple;

import lombok.Data;

@Data
public class Client {

    private Prototype Prototype;

    public Client(Prototype Prototype) {
        this.Prototype = Prototype;
    }

    public Prototype startClone(Prototype concretePrototype) {
        return concretePrototype.clone();
    }

}
