package core.java.allLevel.DesignPattern.creational.singleton;

import java.lang.reflect.Constructor;

public class Fourth_ReflectionSingletonTest {
    public static void main(String[] args) {
        First_EagerInitializedSingleton instanceOne = First_EagerInitializedSingleton.getInstance();
        First_EagerInitializedSingleton instanceTwo = null;
        try {
            Constructor[] constructors = First_EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (First_EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

}
