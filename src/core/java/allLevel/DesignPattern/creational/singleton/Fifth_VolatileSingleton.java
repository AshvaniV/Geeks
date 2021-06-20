package core.java.allLevel.DesignPattern.creational.singleton;

public class Fifth_VolatileSingleton {

    private static volatile Fifth_VolatileSingleton instance = null;

    private Fifth_VolatileSingleton() {
    }

    public static Fifth_VolatileSingleton getInstance() {
        if (instance == null) {
            synchronized (Fifth_VolatileSingleton.class) {
                if (instance == null) {
                    System.out.println("Printed in volatile ");
                    instance = new Fifth_VolatileSingleton();
                }
            }
        }
        return instance;
    }

    public void getName() {
        System.out.println("Volatile Singleton");
    }
}
/*This is best approach which is Thread safe and also Lazy initialized*/