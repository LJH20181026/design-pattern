package com.designpattern.c.prototypepattern.deep;

import lombok.Data;

import java.io.*;
import java.util.Date;

@Data
public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {

    public JinGuBang jinGuBang;

    public QiTianDaSheng () {
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    public QiTianDaSheng deepClone() {
        try {
            //通过字节码在内存中完成对象的读写，类似序列化
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            //新的对象
            QiTianDaSheng copy = (QiTianDaSheng) ois.readObject();
            copy.setBirthday(new Date());
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public QiTianDaSheng shallowClone(QiTianDaSheng target) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.setBirthday(new Date());
        qiTianDaSheng.setJinGuBang(target.jinGuBang);
        qiTianDaSheng.setHeight(target.height);
        qiTianDaSheng.setWeight(target.weight);

        return qiTianDaSheng;
    }

}
