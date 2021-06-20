package java8.package3;

import java.util.function.BiConsumer;

//There are multiple ways to handle exception in Lambda and below are 2 ways for same but both of them doesn't
//show any standard. they are just the ways how can we handle Exception because if we handle exception in this
//way then we have to write code to every possible exception that can occur in our code and that is not feasible.
public class ExceptionHandlingExample1 {
    public static void main(String[] args) {
        int[] numberArray = {10, 20, 30, 40, 50};
        int key = 0;

        //processWithLambda1(numberArray, key, (a, b) -> System.out.println(a/b));

        processWithLambda2(numberArray, key, (a, b) ->
        {
            try {
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println("There is an exception as key is 0 " + e.toString());
            }
            ;
        });
    }

//while writing processWithLambda() method we need to take an interface which allow 2 arguments and don't do anything : BiConsumer

    //method1: declare catch() to catch exception before define lambda

    private static void processWithLambda1(int[] array, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int i : array) {
            try {
                biConsumer.accept(i, key);
            } catch (Exception e) {
                System.out.println("There is an exception as key is 0 " + e.toString());
                ;
            }
        }
    }
    //Actually we don't know what operation will be coming with biConsumer so instead of handle exception here,
    // we should handle it with the function which is calling this function i.e processWithLambda2
    private static void processWithLambda2(int[] array, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int i : array) {
            biConsumer.accept(i, key);
        }
    }
}
