package java8.package9;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

/*
Function is a functional interface in Java8 which take any type of input and return any other type of output after
implementing it's required methods per our requirement. It has an abstract method known as apply().
*/
public class FunctionExample1 {
    public static void main(String[] args) {
        Function<String, Integer> function = input -> input.length();
        String name = "Ashvani Sharma";
        System.out.println(function.apply(name));

/* IntFunction will take primitive data as input and will return per implementation [Below will return Integer].
So it need conversion only once as it will receive int input, make its square and return it. If we want to skip one
time conversion as well then we can use IntUnaryOperator interface.
*/
        IntFunction<Integer> intFunction = input -> input*input;
        int a = 10;
        System.out.println(intFunction.apply(a));

/*
Below function will return output in primitive int
ToIntFunction, ToLongFunction, TODoubleFunction
Below will take different primitive type input and return them back to different primitive type.
IntToLongFunction, IntToDoubleFunction, LongToIntFunction, LongToDoubleFunction, DoubleToIntFunction,
DoubleToLongFunction.
There are multiple Bi functions for same as well.
*/

        //here no conversion is happening
        ToIntFunction<String> toIntFunction = input -> input.length();
        toIntFunction.applyAsInt("Ashvani");
    }
}

