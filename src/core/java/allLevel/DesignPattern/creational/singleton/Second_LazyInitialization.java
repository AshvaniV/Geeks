package core.java.allLevel.DesignPattern.creational.singleton;

public class Second_LazyInitialization {
    private static Second_LazyInitialization instance;

    private Second_LazyInitialization() {
    }

    public static Second_LazyInitialization getInstance() {
        if (instance == null) {
            System.out.println("creating Second_LazyInitialization instance");
            instance = new Second_LazyInitialization();
        }
        return instance;
    }
}

//Instance will be created whenever required
/*The above implementation works fine in case of the single-threaded environment but when it comes to multithreaded
systems, it can cause issues if multiple threads are inside the if condition at the same time. It will destroy the
 singleton pattern and both threads will get the different instances of the singleton class. In next section, we will
 see different ways to create a thread-safe singleton class.*/