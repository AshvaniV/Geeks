package core.java.allLevel.DesignPattern.creational.singleton;

import java.lang.reflect.Constructor;

public class App {
    public static void main(String[] args) {

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    Second_LazyInitialization.getInstance();
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    Second_LazyInitialization.getInstance();
                }
            }
        }.start();


        Fifth_ENUMSingleton.doSomething();
        Fifth_ENUMSingleton.INSTANCE.doSomething1();


        Fifth_VolatileSingleton f1 = Fifth_VolatileSingleton.getInstance();
        Fifth_VolatileSingleton f2 = null;

        try {
            Constructor[] constructors = Fifth_VolatileSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                f2 = (Fifth_VolatileSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(f1.hashCode());
        System.out.println(f2.hashCode());

    }
}
