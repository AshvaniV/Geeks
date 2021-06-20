package java8.package3;

import java.util.function.BiConsumer;

//this class is having Standard way of handling exception while using lambda
//We need a wrapper lambda which will be used to wrapped with this lambda.
//So whatever operation we are doing with lambda at the time of calling function processWithLambda1, can be achieved
//by wrapped lambda function.
public class ExceptionHandlingExample2 {

    public static void main(String[] args) {
        int[] numberArray = {10, 20, 30, 40, 50};
        int key = 0;

//processWithLambda1(numberArray, key, (a, b) -> System.out.println(a/b));

//passing a lambda expression into wrapper lambda
        processWithLambda1(numberArray, key,
                wrapperLambda2(
                        (a, b) -> System.out.println(a / b))
        );
    }

//First way to write lambda for Exception Handling
    private static void processWithLambda1(int[] array, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : array) {
            consumer.accept(i, key);
        }
    }

/*wrapper function are so powerful so they can changes the meaning of what we have defined in our lambda by give a new
definition as below*/
//our original lambda operation was doing a/b but we override that operation with wrapper lambda operation
    private static BiConsumer<Integer, Integer> wrapperLambda1(BiConsumer<Integer, Integer> biConsumer) {
        return (a, b) -> System.out.println(a + b);
    }

/*below is the true lambda wrapper which is nothing but an extra layer which creating a new lambda expression.
This only does, what the consumer does. We can add additional operation here like printing something*/
    private static BiConsumer<Integer, Integer> wrapperLambda2(BiConsumer<Integer, Integer> consumer) {
        return (a, b) -> {
            try{
                consumer.accept(a, b);
            }
            catch (ArithmeticException e) {
                System.out.println("we got Arithmetic exception");
            }
        };
    }
}

/*call flow:
* processWithLambda1() is getting called from main() method so it will go to processWithLambda1() implementation,
* we gave an implementation to BiConsumer interface's method from where it was called (main method calling).
*So be more simple, BiConsumer in processWithLambda1() having an wrapper implementation so it will go to wrapper
* implementation and it there was any exception it will be caught on wrapper.
* */