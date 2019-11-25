package com.designpattern.c.prototypepattern.simple;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        Client client = new Client(concretePrototypeA);
        concretePrototypeA.setAge(18);
        concretePrototypeA.setHobbies(new ArrayList());
        concretePrototypeA.setName("concretePrototypeA");
        ConcretePrototypeA prototypeClone = (ConcretePrototypeA) client.startClone(concretePrototypeA);
        System.out.println(concretePrototypeA);
        System.out.println(prototypeClone);

        System.out.println("克隆对象中的引用类型地址值：" + prototypeClone.getHobbies());
        System.out.println("原对象中的引用类型地址值：" + concretePrototypeA.getHobbies());
        System.out.println("对象地址比较："+(prototypeClone.getHobbies() ==
                concretePrototypeA.getHobbies()));

        //克隆对象和原对象的hobbies的引用地址是一样的，说明复制的不是值，而是引用的地址，如果修改任意一个对象中hobbies的值，
        // 克隆对象和原对象都会改变，即浅克隆
    }
}
