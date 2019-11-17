package com.designpattern.b.singletonpattern.d.serializablebrokensingleton;

import java.io.*;

public class SerializableBrokenSingletonTest {

    public static void main(String[] args) {
        SerializableSingleton s1;
        SerializableSingleton s2 = SerializableSingleton.getInstance();

        try {
            FileOutputStream fos = new FileOutputStream("SerializableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("SerializableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SerializableSingleton) ois.readObject();
            ois.close();
            fis.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
