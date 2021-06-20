package java8.package4;

public class ClosuresExample {

    public static void doProcess(int i, Process P) {
        P.process(i);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

/*in java8, compiler has an eye on variable declaration that's why we can use variable b inside process() method even though
we are having only one argument in process() method of Process interface. Here compiler is treating b as an effective
final variable consider that its value is not going to be modified later. This concept is similar to closure in functional
programming.
once the value of b is getting used by anonymous class (lambda or without lambda), compiler will fridge the value
of b and treat it as final.*/

        //java 7
        /*doProcess(a, new Process() {
            @Override
            public void process(int i) {
                System.out.println("sum of a and b" + i + b);
            });
        }*/

        doProcess(a, i -> System.out.println(i + b));
    }
}

interface Process {
    void process(int i);
}
