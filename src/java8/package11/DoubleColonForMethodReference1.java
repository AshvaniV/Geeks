package java8.package11;

//double colon operator can be used as alternate of lambda.
public class DoubleColonForMethodReference1 {

    public void show() {
        System.out.println("this is show method of DoubleColonForMethodReference1 class");
    }

    public static void main(String[] args) {
        DoubleColonForMethodReference1 D1 = new DoubleColonForMethodReference1();

        //functional interface's display() method implementation using lambda
        FunctionalInterface1 fn1 = () -> {
            System.out.println("this is the implementation of FunctionalInterface1's display() method");
        };
        fn1.display();

        /*
        we can also refer class's method as implementation for our interface as below, in this case if we call
        interface's method it will give output from class's method which we have used as reference.
        METHOD REFERENCE : both these methods should have same arguments [type and number of args both]
        If we have show() method as static then instead of object we will refer it with class name.
        */
        FunctionalInterface1 fn2 = D1::show;
        fn2.display();
    }
}


interface FunctionalInterface1 {
    public void display();
}
