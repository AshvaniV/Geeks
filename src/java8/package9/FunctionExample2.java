package java8.package9;

import java.util.function.Function;

public class FunctionExample2 {
    public static void main(String args[]) {
        Function<Integer, Integer> sum = input -> (input + input);
        Function<Integer, Integer> square = input -> input * input;

        //add a number in itself and then square it
        System.out.println(sum.andThen(square).apply(10)); //first do sum and then square [(10+10) * 20]
        System.out.println(sum.compose(square).apply(10)); //first do square and then sum [(10*10) + 100]
    }
}
