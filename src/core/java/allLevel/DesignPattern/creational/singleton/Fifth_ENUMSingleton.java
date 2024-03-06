package core.java.allLevel.DesignPattern.creational.singleton;

public enum Fifth_ENUMSingleton {

    INSTANCE;
    public static void doSomething() {
        System.out.println("doing something()");
    }

    public void doSomething1() {
        System.out.println("doing something1()");
    }
}
/*To overcome this situation with Reflection, Joshua Bloch suggests the use of Enum to implement Singleton design
pattern as Java ensures that any enum value is instantiated only once in a Java program. Since Java Enum values are
globally accessible, so is the singleton. The drawback is that the enum type is somewhat inflexible; for example,
it does not allow lazy initialization.*/