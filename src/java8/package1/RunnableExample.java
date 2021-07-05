package java8.package1;

public class RunnableExample {
    public static void main(String[] args) {
        
//Anonymous inner class for runnable
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run method for thread1");
            }
        });
        thread1.start();

//lambda for runnable : As runnable is a functional interface we know there is only one method is this (run()),
//so we can provide implementation for this method directly as below.
        Thread thread2 = new Thread(() -> System.out.println("run method for thread2"));
        thread2.start();
    }
}
