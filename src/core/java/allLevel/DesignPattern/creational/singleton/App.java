package core.java.allLevel.DesignPattern.creational.singleton;

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

    }
}
