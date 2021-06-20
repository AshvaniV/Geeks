package core.java.allLevel.DesignPattern.creational.singleton;

public class First_EagerInitializedSingleton {
    private static final First_EagerInitializedSingleton instance = new First_EagerInitializedSingleton();

    //private constructor to avoid client applications to use constructor
    private First_EagerInitializedSingleton() {
    }

    public static First_EagerInitializedSingleton getInstance() {
        System.out.println("instance is First_EagerInitializedSingleton is created");
        return instance;
    }
}
//even though we don't use this class, still it will create an instance
//if we want to handle exception here then we can create instance in static block