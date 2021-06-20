package java8.package5;

public class MethodReferenceExample1 {
    public static void main(String[] args) {
        Thread T1 = new Thread(() -> printMsg());                  //this can be replaced by method reference for lambda
//method reference for lambda, here classname :: method name because printMsg() is a static method
        Thread T2 = new Thread(MethodReferenceExample1 :: printMsg);

        T2.start();
        T1.start();


    }

    public static void printMsg() {
        System.out.println("Hello in printMsg()");

    }
}

