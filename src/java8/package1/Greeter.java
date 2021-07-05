package java8.package1;

public class Greeter {

    //functional behavior using Java7
    public void greet1(IGreeting greeting) {
        greeting.greet();
    }

    //functional behavior using Java8
    public void greet2(IWelcoming welcoming) {
        welcoming.welcome();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        IGreeting greeting = new Greeting();

        //passing an object to achieve "pass behavior as argument (object that have a behavior)"
        greeter.greet1(greeting);

        // we have concept of Anonymous inner class to implement functional interface, so we can pass behavior attached to object created for anonymous inner class
        IWelcoming innerClass = new IWelcoming() {
            @Override
            public void welcome() {
                System.out.println("Hello world from lambda using anonymous inner class (for implementation of functional interface)");
            }
        };
        greeter.greet2(innerClass);

        //basic lambda function (LambdaInterface can be created inside this class or outside but must be functional interface)
        LambdaInterface lambda1 = () -> System.out.println("Hello world from lambda by using functional interface");
        lambda1.lambdaFunction();

        //passing lambda as a behavior
        IWelcoming lambda2 = () -> System.out.println("Hello World from lambda by passing lambda as behavior");
        greeter.greet2(lambda2);

    }





    //functional interface for lambda
    interface LambdaInterface {
        public void lambdaFunction();
    }

}
