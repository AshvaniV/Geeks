package core.java.allLevel.DesignPattern.creational.singleton;

import java.io.Serializable;

public class Sixth_LoggerSingleton implements Serializable, Cloneable {
    private static volatile Sixth_LoggerSingleton INSTANCE;

    private Sixth_LoggerSingleton() {
        //this will handle the reflection
        if (null != INSTANCE) throw new RuntimeException("Don't be Smart");
    }

    //Handle Multithreading and Lazy initialization
    public static Sixth_LoggerSingleton getInstance() {
        if (null == INSTANCE) {
            synchronized (Sixth_LoggerSingleton.class) {
                if (null == INSTANCE) {
                    INSTANCE = new Sixth_LoggerSingleton();
                }
            }
        }
        return INSTANCE;
    }

    //overcome the Serialization issue. the readResolve() method is used to replace the object that is created during
    // deserialization with a different object.
    protected Object readResolve() {
        return INSTANCE;
    }

    //Overcome Cloning issue
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}