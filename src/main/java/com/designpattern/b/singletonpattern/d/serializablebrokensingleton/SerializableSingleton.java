package com.designpattern.b.singletonpattern.d.serializablebrokensingleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {

    private SerializableSingleton() {}

    private static final SerializableSingleton INSTANCE = new SerializableSingleton();

    public static SerializableSingleton getInstance() {
        return INSTANCE;
    }

    /**
     *
     * @return
     */
    private Object readResolve() {
        return INSTANCE;
    }

}
