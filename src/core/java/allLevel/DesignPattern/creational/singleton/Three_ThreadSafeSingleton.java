package core.java.allLevel.DesignPattern.creational.singleton;

public class Three_ThreadSafeSingleton {
    private static Three_ThreadSafeSingleton instance;

    private Three_ThreadSafeSingleton(){}

    public static synchronized Three_ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new Three_ThreadSafeSingleton();
        }
        return instance;
    }

/*Above implementation works fine and provides thread-safety but it reduces the performance because of the cost
associated with the synchronized method. to avoid this extra overhead every time, double checked locking principle is used.
In this approach, the synchronized block is used inside the if condition with an additional check to ensure that only
one instance of a singleton class is created.*/

    public static Three_ThreadSafeSingleton getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (Three_ThreadSafeSingleton.class) {
                if(instance == null){
                    instance = new Three_ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
