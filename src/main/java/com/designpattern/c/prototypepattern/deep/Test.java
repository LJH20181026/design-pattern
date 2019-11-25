package com.designpattern.c.prototypepattern.deep;

public class Test {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        QiTianDaSheng deepClone = qiTianDaSheng.deepClone();
        QiTianDaSheng shallowClone = qiTianDaSheng.shallowClone(qiTianDaSheng);

        System.out.println("deepClone:" + (qiTianDaSheng.jinGuBang == deepClone.jinGuBang));
        System.out.println("shallowClone:" + (qiTianDaSheng.jinGuBang == shallowClone.jinGuBang));
    }
}
